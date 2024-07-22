package com.ust.doctor.client;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
    private Long id;
    private Long patientId;
    private Long doctorId;
    private String date;
    private String status;
}
