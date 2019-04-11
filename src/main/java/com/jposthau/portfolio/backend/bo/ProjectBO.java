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
@Table(name = "Project")
public class ProjectBO {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "technologies")
	private String technologies;
	
	public ProjectBO() {
	}
	
	/**
	 * @param name
	 * @param description
	 * @param technologies
	 */
	public ProjectBO(String name, String description, String technologies) {
		this.name = name;
		this.description = description;
		this.technologies = technologies;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
