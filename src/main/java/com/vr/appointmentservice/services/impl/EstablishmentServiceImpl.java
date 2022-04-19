package com.vr.appointmentservice.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vr.appointmentservice.entities.Establishment;
import com.vr.appointmentservice.repositories.EstablishmentRepository;
import com.vr.appointmentservice.services.EstablishmentService;

@Service
public class EstablishmentServiceImpl extends BaseServiceImpl<Integer, Establishment> implements EstablishmentService{

	@Autowired
	EstablishmentRepository establishmentRepository;
}
