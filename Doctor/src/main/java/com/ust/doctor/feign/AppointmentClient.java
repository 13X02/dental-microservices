package com.ust.doctor.feign;

import com.ust.doctor.client.Appointment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "appointmentservice" ,url = "http://localhost:9101/appointment")
public interface AppointmentClient {

    @GetMapping("/getAllAppointment")
    public List<Appointment> getAllAppointment();
}