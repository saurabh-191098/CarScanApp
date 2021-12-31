package com.example.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	private long id;
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private String fname;
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private String lname;
	@Temporal(value=TemporalType.DATE)
	@JsonFormat(pattern = "yyyy/MM/dd", shape = JsonFormat.Shape.STRING)
	private Date dob;
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private String city;
	@JsonFormat(shape = JsonFormat.Shape.NUMBER)
	private long phone;
	
	public UserEntity(long id, String fname, String lname, Date dob, String city, long phone) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.city = city;
		this.phone = phone;
	}

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
}
