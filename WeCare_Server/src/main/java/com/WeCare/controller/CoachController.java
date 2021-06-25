package com.WeCare.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WeCare.DTO.CoachDTO;

@CrossOrigin
@RestController
@RequestMapping("CoachContoller")
public class CoachController {
	
//	@Autowired
//	private RegistrationService service;
	
	
//	@PostMapping("/coaches")
//	@CrossOrigin(origins="http://localhost:4200")
//	public String registerUser(@RequestBody CoachDTO coachDTO) throws Exception {
//		
//		String tempEmailId=coachDTO.getCoachId();
//		if(tempEmailId!=null && !"".equals(tempEmailId)) {
//			CoachDTO userobj=service.fetchUserByEmailId(tempEmailId);
//			if(userobj!=null) {
//				throw new Exception("User with "+tempEmailId+" already exists");
//			}
//		}
//		User userObj=null;
//		userObj=service.saveUser(user);
//		return userObj;
//		
//	}
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
