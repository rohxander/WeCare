package com.WeCare.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.WeCare.DTO.CoachDTO;
import com.WeCare.DTO.LoginDTO;
import com.WeCare.Entity.CoachEntity;
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
	
	@GetMapping("/coaches/{coachId}")
	public CoachDTO getCoachProfile(@PathVariable("coachId") String CoachId ) throws Exception {
		CoachDTO coachDTO = new CoachDTO();
		coachDTO = service.getCoachProfile(CoachId);
		return coachDTO;
	}
	
	@GetMapping("/coaches/all")
	public List<CoachEntity> showAllCoaches() throws Exception {
		List<CoachEntity> list = new ArrayList<CoachEntity>();
		list = service.showAllCoaches();
		return list;
	}
}
