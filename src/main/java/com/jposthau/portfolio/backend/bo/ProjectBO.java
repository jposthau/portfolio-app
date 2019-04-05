/**
 * 
 */
package com.jposthau.portfolio.backend.bo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Jordan Posthauer
 *
 */

@Entity
public class ProjectBO {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String description;
	private List<String> technologies;
	
	public void addTechnology(String technology) {
		technologies.add(technology);
	}
	
	public void removeTechnology(String technology) {
		technologies.remove(technology);
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
	public List<String> getTechnologies() {
		return technologies;
	}
	/**
	 * @param technologies the technologies to set
	 */
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	
}
