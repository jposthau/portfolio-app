package com.jposthau.portfolio.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jposthau.portfolio.backend.bo.ResumeBO;
import com.jposthau.portfolio.backend.data.ContactInfoRepository;
import com.jposthau.portfolio.backend.data.EducationRepository;
import com.jposthau.portfolio.backend.data.ProjectRepository;
import com.jposthau.portfolio.backend.data.WorkExperienceRepository;

@RestController
public class HomeController {
	
	@Autowired
	ContactInfoRepository contactRepo;
	
	@Autowired
	WorkExperienceRepository workRepo;
	
	@Autowired
	ProjectRepository projectRepo;
	
	@Autowired
	EducationRepository educationRepo;
	
	TestDataBuilder dataBuilder = new TestDataBuilder();
	
	@GetMapping("/save")
	public void save() {
		
		ResumeBO resume = dataBuilder.build();
		
		contactRepo.save(resume.getContactInfo());
		workRepo.saveAll(resume.getWorkExperiences());
		projectRepo.saveAll(resume.getProjects());
		educationRepo.saveAll(resume.getEducations());
		
		
		
	}
	
}
