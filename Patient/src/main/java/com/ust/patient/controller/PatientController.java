package com.ust.patient.controller;

import com.ust.patient.model.Patient;
import com.ust.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/addPatient")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient) {
        return ResponseEntity.ok(patientService.savePatient(patient));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Patient>> getAllPatient() {

        return ResponseEntity.ok(patientService.getAllPatients());
    }

    @GetMapping("/getPatient/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(patientService.getPatientById(id));
    }


}
