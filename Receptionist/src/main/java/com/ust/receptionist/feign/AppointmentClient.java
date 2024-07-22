package com.ust.receptionist.feign;

import com.ust.receptionist.client.Appointment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "appointmentservice" ,url = "http://localhost:9101/appointment")
public interface AppointmentClient {

    @GetMapping("/getAllAppointment")
    public List<Appointment> getAllAppointment();

    @PostMapping("/changeStatus")
    public Appointment changeStatus(@RequestBody Appointment appointment);

    @GetMapping("/getAppointmentById/{id}")
    public Appointment getAppointmentById(@PathVariable Long id);

}
