package com.greatlearning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS")
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	
	private String firstName;
	private String lastName;
	private String eMail;
	
	public Customer(String firstName, String lastName, String eMail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
	}
	
	public Customer() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", eMail=" + eMail + "]";
	}
	
	

}
