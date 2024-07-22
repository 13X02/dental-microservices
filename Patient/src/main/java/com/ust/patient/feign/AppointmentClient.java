package com.ust.patient.feign;

import com.ust.patient.client.Appointment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "appointmentservice" ,url = "http://localhost:9101/appointment")
public interface AppointmentClient {
    @PostMapping("/addAppointment")
    public Appointment addAppointment(@RequestBody Appointment appointment);
}