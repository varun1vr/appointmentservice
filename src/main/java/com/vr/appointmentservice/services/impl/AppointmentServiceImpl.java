package com.vr.appointmentservice.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vr.appointmentservice.entities.Appointment;
import com.vr.appointmentservice.repositories.AppointmentRepository;
import com.vr.appointmentservice.services.AppointmentService;

@Service
public class AppointmentServiceImpl extends BaseServiceImpl<Integer, Appointment> implements AppointmentService {

	@Autowired
	AppointmentRepository appointmentRepository;
}
