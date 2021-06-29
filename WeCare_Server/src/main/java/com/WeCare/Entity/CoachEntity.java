package com.WeCare.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.WeCare.Utility.CoachIdGenerator;

@Entity(name="coachtable")
public class CoachEntity {
	@Id
	private String coachId;
	
	@Column
	private String password;
	
	@Column
	private String name;
	
	@Column(name="date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column
	private char gender;
	
	@Column(name = "mobile_number")
	private long mobileNumber;
	
	@Column
	private String speciality;

	public String getCoachId() {
		return coachId;
	}

	public void setCoachId(Object object) {
		CoachIdGenerator generator = new CoachIdGenerator();
		this.coachId = generator.generate(null, object);
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
	
	@Override
	public String toString() {
		return "CoachEntity [coachId=" + coachId + ", password=" + password + ", name=" + name + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", speciality=" + speciality
				+ "]";
	}

}
