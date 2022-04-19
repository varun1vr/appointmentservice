package com.vr.appointmentservice.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "service")
public class Service {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "NAME", nullable = false)
    private String serviceName;
    
    @Column(name = "ESTABLISHMENTID", nullable = false)
    private int establishmentId;
    
    @Column(name = "DURATION", nullable = false)
    private int duration;
    
    @Column(name = "PRICE", nullable = false)
    private float price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public int getEstablishmentId() {
		return establishmentId;
	}

	public void setEstablishmentId(int establishmentId) {
		this.establishmentId = establishmentId;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
    
    
    

}
