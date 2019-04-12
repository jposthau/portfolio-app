/**
 * 
 */
package com.jposthau.portfolio.backend.bo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Jordan Posthauer
 *
 */

public class ResumeBO {
		
	private ContactInfoBO contactInfo;
	private List<String> technologies;
	private List<WorkExperienceBO> workExperiences;
	private List<EducationBO> educations;
	private List<ProjectBO> projects;
	
	public ResumeBO() {
	}
		
	/**
	 * @param contactInfo
	 * @param technologies
	 * @param workExperiences
	 * @param educations
	 * @param projects
	 */
	public ResumeBO(ContactInfoBO contactInfo, List<String> technologies, List<WorkExperienceBO> workExperiences,
			List<EducationBO> educations, List<ProjectBO> projects) {
		this.contactInfo = contactInfo;
		this.technologies = technologies;
		this.workExperiences = workExperiences;
		this.educations = educations;
		this.projects = projects;
	}

	public void addTechnology(String technology) {
		if(technology != null) {
			technologies.add(technology);
		}
	}
	
	public void removeTechnology(String technology) {
		technologies.remove(technology);
	}
	
	public void addWork(WorkExperienceBO work) {
		if(workExperiences == null) {
			workExperiences = new ArrayList<WorkExperienceBO>();
		}
		if(work != null) {
			workExperiences.add(work);
		}
	}
	
	public void removeWork(WorkExperienceBO work) {
		workExperiences.remove(work);
	}
	
	public void addEducation(EducationBO education) {
		if(educations == null) {
			educations = new ArrayList<EducationBO>();
		}
		if(education != null) {
			educations.add(education);
		}
	}
	
	public void removeEducation(EducationBO education) {
		educations.remove(education);
	}
	
	public void addProject(ProjectBO project) {
		if(projects == null) {
			projects = new ArrayList<ProjectBO>();
		}
		if(project != null) {	
			projects.add(project);
		}
	}
	
	public void removeProject(ProjectBO project) {
		projects.remove(project);
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
	
	public void setEducations(Iterable<EducationBO> itr) {
		Iterator<EducationBO> iterator = itr.iterator();
		while(iterator.hasNext()) {
			this.addEducation(iterator.next());
		}
	}
	
	public void setProjects(Iterable<ProjectBO> itr) {
		Iterator<ProjectBO> iterator = itr.iterator();
		while(iterator.hasNext()) {
			this.addProject(iterator.next());
		}
	}
	
	public void setWorkExperiences(Iterable<WorkExperienceBO> itr) {
		Iterator<WorkExperienceBO> iterator = itr.iterator();
		while(iterator.hasNext()) {
			this.addWork(iterator.next());
		}
	}
	
}
