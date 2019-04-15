package com.jposthau.portfolio.backend.controller;

import java.util.ArrayList;
import java.util.List;

import com.jposthau.portfolio.backend.bo.ContactInfoBO;
import com.jposthau.portfolio.backend.bo.EducationBO;
import com.jposthau.portfolio.backend.bo.ProjectBO;
import com.jposthau.portfolio.backend.bo.ResumeBO;
import com.jposthau.portfolio.backend.bo.WorkExperienceBO;

public class TestDataBuilder {

	public ResumeBO build() {
		
//		String description1 = "<ul>\r\n" + 
//				"<li>Java Developer in the financial industry.</li>\r\n" + 
//				"<li>Secured existing SOAP services using JWT.</li>\r\n" + 
//				"<li>Created java code to call new services in existing web applications.</li>\r\n" + 
//				"<li>Made front end changes to fix bugs in existing java applications.</li>\r\n" + 
//				"<li>Performed infrastructure changes in Websphere server to facilitate JWT implementation.</li>\r\n" + 
//				"</ul>";
		String role1 = "Associate Java Consultant";
		String company1 = "Capgemini America";
		String technologies1 = "<p><u>Technologies: Core Java, XML, Eclipse, IBM Websphere, Gradle, Jenkins, SonarQube, Nexus, Github, Spring Framework, SOAP, Rest, Linux, JSON, Agile.</u></p>";
		
//		String description2 = "<ul>\r\n" + 
//				"<li>Student worker for the university IT department.</li>\r\n" + 
//				"<li>Assisted students and faculty over the phone and in person with various IT related issues.</li>\r\n" + 
//				"<li>Created tickets to organize and distribute tasks throughout different IT department units.</li>\r\n" + 
//				"<li>Imaged and installed new computers for faculty, staff and labs.</li>\r\n" + 
//				"<li>Installed new software and performed virus and malware removal.</li>\r\n" + 
//				"</ul>";
		String role2 = "IT Technician Level 1 & 2";
		String company2 = "Purdue Northwest Information Services";
		String technologies2 = "<p><u>Technologies: Microsoft Windows 7 &amp; 10, Mac OS, Team Dynamics, Footprints.</u></p>";
		
		ContactInfoBO contactInfo = new ContactInfoBO("Jordan", "L.", "Posthauer", "765-225-8139", "jlposthau@gmail.com", "1314 W Ohio St. Chicago, IL 60642");
		WorkExperienceBO workExperience1 = new WorkExperienceBO(role1, company1, "Hammond, IN ", "September 2015", "December 2018", "", technologies1);
		WorkExperienceBO workExperience2 = new WorkExperienceBO(role2, company2, "Rosemont, IL", "May 2018", "Present", "", technologies2);
		EducationBO education1 = new EducationBO("Purdue University Northwest", "Hammond, IN", "Bachelor of Science in Engineering", "Computer Engineering", "Computer Science", "", "August 2014", "December 2017");
		EducationBO education2 = new EducationBO("Wabash College", "Crawfordsville, IN", "", "Physics", "Mathematics", "", "August 2012", "May 2013");
		ProjectBO project1 = new ProjectBO("Bicycle Crosswalk Safety Automation", "", "");
		ProjectBO project2 = new ProjectBO("Dog Bark Sensor", "", "");
		
		List<String> technologies = new ArrayList<String>();
		List<WorkExperienceBO> workExperiences = new ArrayList<WorkExperienceBO>();
		List<EducationBO> educations = new ArrayList<EducationBO>();
		List<ProjectBO> projects = new ArrayList<ProjectBO>();
		
		technologies.add(technologies1);
		technologies.add(technologies2);
		
		workExperiences.add(workExperience1);
		workExperiences.add(workExperience2);
		
		educations.add(education1);
		educations.add(education2);
		
		projects.add(project1);
		projects.add(project2);
		
		ResumeBO resume = new ResumeBO(contactInfo, technologies, workExperiences, educations, projects);
		
		return resume;
		
	}

}
