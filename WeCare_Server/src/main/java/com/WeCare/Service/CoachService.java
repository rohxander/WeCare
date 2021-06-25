package com.WeCare.Service;

import org.springframework.stereotype.Service;

import com.WeCare.DTO.CoachDTO;
import com.WeCare.DTO.LoginDTO;
import com.WeCare.Entity.CoachEntity;
import com.WeCare.Repository.CoachRepository;

@Service
public class CoachService {
	
	public CoachRepository coachRepository;
	
	public String createCoach(CoachDTO coachDTO) {	
		return coachDTO.getCoachId();
	}
	
	public boolean loginCoach(LoginDTO loginDTO) {
		return false;
	}
	
	public CoachDTO getCoachProfile(String CoachId) {
		CoachEntity coachEntity = new CoachEntity();
		
		CoachDTO dummy = new CoachDTO();
		return dummy;
	}
}
