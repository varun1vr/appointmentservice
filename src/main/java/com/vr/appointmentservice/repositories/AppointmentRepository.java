package com.vr.appointmentservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.vr.appointmentservice.entities.Appointment;


public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {
	
}
