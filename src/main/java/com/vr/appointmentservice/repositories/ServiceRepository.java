package com.vr.appointmentservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.vr.appointmentservice.entities.Service;

public interface ServiceRepository extends CrudRepository<Service, Integer>{

}
