package com.hibenate.basic;

import javax.persistence.Embeddable;

@Embeddable // add this class data to another table in which we are using @Embedded, so no need to carete table for this class
public class StudentAddress {
	
	/*@Id
	@GeneratedValue
	private int id;*/
	
	private int pin;
	private String city;
	private String country;
	
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}*/
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
