package com.ust.patient.service;

import com.ust.patient.client.Appointment;
import com.ust.patient.feign.AppointmentClient;
import com.ust.patient.model.Patient;
import com.ust.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private AppointmentClient appointmentClient;


    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }


    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).get();
    }

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Appointment bookAppointment(Appointment appointment){
        appointment.setStatus("pending");
        return  appointmentClient.addAppointment(appointment);

    }



}
