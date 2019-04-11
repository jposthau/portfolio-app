/**
 * 
 */
package com.jposthau.portfolio.backend.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Jordan Posthauer
 *
 */

@Entity
@Table(name = "Education")
public class EducationBO {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "school")
	private String school;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "degree")
	private String degree;
	
	@Column(name = "major")
	private String major;
	
	@Column(name = "minor")
	private String minor;
	
	@Column(name = "gpa")
	private String gpa;
	
	@Column(name = "startDate")
	private String startDate;
	
	@Column(name = "endDate")
	private String endDate;
	
	public EducationBO() {
	}
	
	/**
	 * @param school
	 * @param location
	 * @param degree
	 * @param major
	 * @param minor
	 * @param gpa
	 * @param startDate
	 * @param endDate
	 */
	public EducationBO(String school, String address, String degree, String major, String minor, String gpa, String startDate, String endDate) {
		this.school = school;
		this.address = address;
		this.degree = degree;
		this.major = major;
		this.minor = minor;
		this.gpa = gpa;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Boolean graduated() {
		if(this.degree != null) {
			return true;
		}
		return false;
	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * @return the degree
	 */
	public String getDegree() {
		return degree;
	}

	/**
	 * @param degree the degree to set
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}

	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * @return the minor
	 */
	public String getMinor() {
		return minor;
	}

	/**
	 * @param minor the minor to set
	 */
	public void setMinor(String minor) {
		this.minor = minor;
	}

	/**
	 * @return the gpa
	 */
	public String getGpa() {
		return gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the location
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param location the location to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
		
}
