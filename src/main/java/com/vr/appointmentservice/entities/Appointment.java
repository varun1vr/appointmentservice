package com.vr.appointmentservice.entities;

import java.time.LocalDateTime;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private int id;
	
	@Column(name = "ESTABLISHMENTID", nullable = false)
    private int establishmentId;
	
	@Column(name = "CREATEDBY", nullable = false)
    private int createdBy;
	
	@Column(name = "CREATEDFOR", nullable = false)
    private int createdFor;
	
	@Column(name = "SERVICEID", nullable = false)
    private int serviceId;
	
	@Column(name = "STARTTIME", nullable = false)
    private LocalDateTime startTime;
	
	@Column(name = "ENDTIME", nullable = false)
    private LocalDateTime endTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEstablishmentId() {
		return establishmentId;
	}

	public void setEstablishmentId(int establishmentId) {
		this.establishmentId = establishmentId;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public int getCreatedFor() {
		return createdFor;
	}

	public void setCreatedFor(int createdFor) {
		this.createdFor = createdFor;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	
	

}
