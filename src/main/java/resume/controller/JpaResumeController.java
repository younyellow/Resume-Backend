package resume.controller;

import org.springframework.web.bind.annotation.RestController;

import resume.service.ResumeService;

@RestController
public class JpaResumeController {
	
	private ResumeService resumeService;
	private JpaResumeController(ResumeService resumeService){
		this.resumeService = resumeService;
	}
	
	
}
