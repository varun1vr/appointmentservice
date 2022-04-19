package com.vr.appointmentservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vr.appointmentservice.entities.Establishment;
import com.vr.appointmentservice.services.EstablishmentService;

@RestController
@RequestMapping("establishment")
public class EstablishmentController {
	
	@Autowired
	EstablishmentService establishmentService;
	
	@PostMapping()
	public Establishment createEstablishment(@RequestBody Establishment establishment) {
		return establishmentService.create(establishment);
	}
	
	@GetMapping()
	public List<Establishment> getEstablishments() {
		return establishmentService.getAll();
	}

}
