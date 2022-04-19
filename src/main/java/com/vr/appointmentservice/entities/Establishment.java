package com.vr.appointmentservice.entities;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "establishment")
public class Establishment {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Basic(optional = false)
	    @Column(name = "ID", nullable = false)
	    private int id;

	    @Column(name = "NAME", nullable = false)
	    private String establishmentName;
	    
	    @Column(name = "address", nullable = false)
	    private String address;
	    
	    @Enumerated(EnumType.STRING)
		@Column(length = 20)
		private EstablishmentType type;
	    
	    @Column(name = "OPENINGTIME", nullable = false)
	    private Timestamp openingTime;
	    
	    @Column(name = "CLOSINGTIME", nullable = false)
	    private Timestamp closingTime;
	    
	    @Column(name = "INFO", nullable = false)
	    private String info;
	    
	    @Column(name = "PINCODE", nullable = false)
	    private int pincode;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEstablishmentName() {
			return establishmentName;
		}

		public void setEstablishmentName(String establishmentName) {
			this.establishmentName = establishmentName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public EstablishmentType getType() {
			return type;
		}

		public void setType(EstablishmentType type) {
			this.type = type;
		}

		public Timestamp getOpeningTime() {
			return openingTime;
		}

		public void setOpeningTime(Timestamp openingTime) {
			this.openingTime = openingTime;
		}

		public Timestamp getClosingTime() {
			return closingTime;
		}

		public void setClosingTime(Timestamp closingTime) {
			this.closingTime = closingTime;
		}

		public String getInfo() {
			return info;
		}

		public void setInfo(String info) {
			this.info = info;
		}

		public int getPincode() {
			return pincode;
		}

		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
	    
	    
	    
	    
	    
	    

}
