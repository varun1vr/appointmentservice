package com.vr.appointmentservice.repositories;

import java.util.Optional;

import com.vr.appointmentservice.entities.ERole;
import com.vr.appointmentservice.entities.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
