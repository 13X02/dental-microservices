package com.ust.doctor.service;

import com.ust.doctor.client.Appointment;
import com.ust.doctor.feign.AppointmentClient;
import com.ust.doctor.model.Doctor;
import com.ust.doctor.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private AppointmentClient appointmentClient;
    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }
    public Doctor findById(Long id) {
        return doctorRepository.findById(id).get();
    }
    public Doctor save(Doctor doctor) {
        return doctorRepository.save(doctor);
    }


    public List<Appointment> getAppointmentByDoctorId(Long doctorId) {
        return appointmentClient.getAllAppointment().stream().filter(e->e.getDoctorId()==doctorId && e.getStatus().equalsIgnoreCase("confirmed")).toList();
    }
}
