package com.vr.appointmentservice.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.vr.appointmentservice.entities.Service;
import com.vr.appointmentservice.repositories.ServiceRepository;
import com.vr.appointmentservice.services.ServiceGivenService;

@org.springframework.stereotype.Service
public class ServiceGivenServiceImpl extends BaseServiceImpl<Integer, Service> implements ServiceGivenService{

	@Autowired
	ServiceRepository serviceRepository;
}
