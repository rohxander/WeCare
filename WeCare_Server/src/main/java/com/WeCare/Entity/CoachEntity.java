package com.WeCare.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CoachEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String coachId;
	
	@Column
	private String password;
	
	@Column
	private String name;
	
	@Column
	private LocalDate dateOfBirth;
	
	@Column
	private char gender;
	
	@Column
	private long mobileNumber;
	
	@Column
	private String speciality;

	public String getCoachId() {
		return coachId;
	}

	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
}
