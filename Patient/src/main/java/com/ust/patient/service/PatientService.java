package com.ust.patient.service;

import com.ust.patient.model.Patient;
import com.ust.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }


    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).get();
    }

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }



}
