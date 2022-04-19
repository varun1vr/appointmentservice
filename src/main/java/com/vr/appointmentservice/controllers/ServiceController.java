package com.vr.appointmentservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vr.appointmentservice.entities.Service;
import com.vr.appointmentservice.services.ServiceGivenService;

@RestController
@RequestMapping("service")
public class ServiceController {
	
	@Autowired
	ServiceGivenService givenService;
	
	@PostMapping()
	public Service createService(@RequestBody Service service) {
		return givenService.create(service);
	}

}
