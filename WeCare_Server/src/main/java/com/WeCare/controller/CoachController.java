package com.WeCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WeCare.DTO.CoachDTO;
import com.WeCare.Service.CoachService;

@CrossOrigin
@RestController
public class CoachController {
	
	@Autowired
	private CoachService service;
	
	
	@PostMapping("/coaches")
//	@CrossOrigin(origins="http://localhost:4200")
	public String registerUser(@RequestBody CoachDTO coachDTO){
		
		String newCoachId=null;
		newCoachId=service.createCoach(coachDTO);
		
		return newCoachId;
		
	}
	
//	@PostMapping("/login")
//	@CrossOrigin(origins="http://localhost:4200")
//	public User loginUser(@RequestBody User user) throws Exception {
//		String tempEmailId=user.getEmailId();
//		String tempPassword=user.getPassword();
//		User userObj=null;
//		if(tempEmailId!=null && tempPassword!=null) {
//			userObj=service.fetchUserByEmailIdAndPassword(tempEmailId, tempPassword);
//		}
//		if(userObj==null) {
//			throw new Exception("Bad credentials");
//		}
//		return userObj;
//	}
}
