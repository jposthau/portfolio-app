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
@Table(name = "Work_Experience")
public class WorkExperienceBO {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "role")
	private String role;
	
	@Column(name = "company")
	private String company;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "startDate")
	private String startDate;
	
	@Column(name = "endDate")
	private String endDate;
	
	@Column(name = "technologies")
	private String technologies;
	
	public WorkExperienceBO() {
	}
		
	/**
	 * @param role
	 * @param address
	 * @param startString
	 * @param endString
	 * @param description
	 */
	public WorkExperienceBO(String role, String company, String address, String startDate, String endDate, String description, String technologies) {
		this.role = role;
		this.company = company;
		this.address = address;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
		this.technologies = technologies;
	}

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
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the startString
	 */
	public String getStartDate() {
		return startDate;
	}
	/**
	 * @param startString the startString to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endString
	 */
	public String getEndDate() {
		return endDate;
	}
	/**
	 * @param endString the endString to set
	 */
	public void setEndDate(String endDate) {
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

	/**
	 * @return the technologies
	 */
	public String getTechnologies() {
		return technologies;
	}

	/**
	 * @param technologies the technologies to set
	 */
	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}
	
	
}
