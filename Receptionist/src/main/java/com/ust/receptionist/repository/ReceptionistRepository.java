package com.ust.receptionist.repository;

import com.ust.receptionist.model.Receptionist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceptionistRepository extends JpaRepository<Receptionist,Long> {
}
