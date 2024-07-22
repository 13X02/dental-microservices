package com.ust.receptionist.model.Controller;

import com.ust.receptionist.client.Appointment;
import com.ust.receptionist.model.Receptionist;
import com.ust.receptionist.service.ReceptionistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receptionist")
public class ReceptionistController {

    @Autowired
    private ReceptionistService receptionistService;

    @PostMapping("/addReceptionist")
    public ResponseEntity<Receptionist> addReceptionist(@RequestBody Receptionist receptionist) {
        return ResponseEntity.ok(receptionistService.save(receptionist));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Receptionist>> getAll() {
        return ResponseEntity.ok(receptionistService.findAll());
    }

    @GetMapping("getReceptionist/{id}")

    public ResponseEntity<Receptionist> getReceptionist(@PathVariable Long id) {
        return ResponseEntity.ok(receptionistService.findById(id));
    }

    @GetMapping("confirmAppointment/{id}")
    public ResponseEntity<Appointment> confirmAppointment(@PathVariable Long id) {
        return ResponseEntity.ok(receptionistService.confirmBooking(id));
    }

}
