package com.vr.appointmentservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vr.appointmentservice.entities.Appointment;
import com.vr.appointmentservice.services.AppointmentService;

@RestController
@RequestMapping("appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping()
	public Appointment createAppointment(@RequestBody Appointment appointment) {
		
		return appointmentService.create(appointment);
	}

}
