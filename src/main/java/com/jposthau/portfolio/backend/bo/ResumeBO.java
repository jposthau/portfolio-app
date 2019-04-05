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
public class ResumeBO {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private ContactInfoBO contactInfo;
	private List<String> technologies;
	private List<WorkExperienceBO> workExperiences;
	private List<EducationBO> educations;
	private List<ProjectBO> projects;
	
	public void addTechnology(String technology) {
		technologies.add(technology);
	}
	
	public void removeTechnology(String technology) {
		technologies.remove(technology);
	}
	
	public void addWork(WorkExperienceBO work) {
		workExperiences.add(work);
	}
	
	public void removeWork(WorkExperienceBO work) {
		workExperiences.remove(work);
	}
	
	public void addEducation(EducationBO education) {
		educations.add(education);
	}
	
	public void removeEducation(EducationBO education) {
		educations.remove(education);
	}
	
	/**
	 * @return the contactInfo
	 */
	public ContactInfoBO getContactInfo() {
		return contactInfo;
	}
	/**
	 * @param contactInfo the contactInfo to set
	 */
	public void setContactInfo(ContactInfoBO contactInfo) {
		this.contactInfo = contactInfo;
	}
	/**
	 * @return the education
	 */
	public List<EducationBO> getEducation() {
		return educations;
	}
	/**
	 * @param education the education to set
	 */
	public void setEducation(List<EducationBO> educations) {
		this.educations = educations;
	}
	/**
	 * @return the projects
	 */
	public List<ProjectBO> getProjects() {
		return projects;
	}
	/**
	 * @param projects the projects to set
	 */
	public void setProjects(List<ProjectBO> projects) {
		this.projects = projects;
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

	/**
	 * @return the workExperiences
	 */
	public List<WorkExperienceBO> getWorkExperiences() {
		return workExperiences;
	}

	/**
	 * @param workExperiences the workExperiences to set
	 */
	public void setWorkExperiences(List<WorkExperienceBO> workExperiences) {
		this.workExperiences = workExperiences;
	}

	/**
	 * @return the educations
	 */
	public List<EducationBO> getEducations() {
		return educations;
	}

	/**
	 * @param educations the educations to set
	 */
	public void setEducations(List<EducationBO> educations) {
		this.educations = educations;
	}
	
}
