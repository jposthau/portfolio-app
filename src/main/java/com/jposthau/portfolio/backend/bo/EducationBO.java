/**
 * 
 */
package com.jposthau.portfolio.backend.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Jordan Posthauer
 *
 */

@Entity
public class EducationBO {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String institution;
	private LocationBO location;
	private String degree;
	private String major;
	private String minor;
	private String gpa;
	private Date startDate;
	private Date endDate;
	
	public Boolean graduated() {
		if(this.degree != null) {
			return true;
		}
		return false;
	}

	/**
	 * @return the institution
	 */
	public String getInstitution() {
		return institution;
	}

	/**
	 * @param institution the institution to set
	 */
	public void setInstitution(String institution) {
		this.institution = institution;
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
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the location
	 */
	public LocationBO getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(LocationBO location) {
		this.location = location;
	}
		
}
