package com.WeCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WeCare.DTO.CoachDTO;
import com.WeCare.DTO.LoginDTO;
import com.WeCare.Service.CoachService;

@CrossOrigin
@RestController
public class CoachController {
	
	@Autowired
	private CoachService service;
	
	
	@PostMapping("/coaches")
	public String registerUser(@RequestBody CoachDTO coachDTO) throws Exception{
		
		String newCoachId=null;
		newCoachId=service.createCoach(coachDTO);
		
		return newCoachId;
		
	}
	
	@PostMapping("/coaches/login")
	public Boolean loginUser(@RequestBody LoginDTO loginDTO) throws Exception {
		Boolean flag = null;
		flag = service.loginCoach(loginDTO);
		return flag;
	}
}
