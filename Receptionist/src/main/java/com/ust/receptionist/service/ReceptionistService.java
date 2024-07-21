package com.ust.receptionist.service;

import com.ust.receptionist.model.Receptionist;
import com.ust.receptionist.repository.ReceptionistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceptionistService {

    @Autowired
    private ReceptionistRepository receptionistRepository;

    public List<Receptionist> findAll() {
        return receptionistRepository.findAll();
    }

    public Receptionist findById(Long id) {
        return receptionistRepository.findById(id).orElse(null);
    }
    public Receptionist save(Receptionist receptionist) {
        return receptionistRepository.save(receptionist);
    }

}
