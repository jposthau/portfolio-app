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
public class WorkExperienceBO {

	@Id
	@GeneratedValue
	private Long id;
	
	private String role;
	private LocationBO location;
	private Date startDate;
	private Date endDate;
	private String description;
	
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
