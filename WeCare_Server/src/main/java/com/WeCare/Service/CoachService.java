package com.WeCare.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WeCare.DTO.CoachDTO;
//import com.WeCare.DTO.LoginDTO;
import com.WeCare.Entity.CoachEntity;
import com.WeCare.Repository.CoachRepository;

@Service
public class CoachService {
	
	@Autowired
	public CoachRepository coachRepository;
	
	public String createCoach(CoachDTO coachDTO) throws Exception{
		Long mobile = coachDTO.getMobileNumber();
		if(mobile!=null && !"".equals(mobile)) {
			CoachEntity mobileCheck = coachRepository.findByMobileNumber(mobile);
			if(mobileCheck!=null) {
				throw new Exception("User with "+ mobile +" already exists");
			}
		}
		CoachEntity coachEntity = new CoachEntity();
		CoachEntity dummy = new CoachEntity();
		coachEntity.setCoachId(coachDTO);
		coachEntity.setDateOfBirth(coachDTO.getDateOfBirth());
		coachEntity.setGender(coachDTO.getGender());
		coachEntity.setMobileNumber(coachDTO.getMobileNumber());
		coachEntity.setName(coachDTO.getName());
		coachEntity.setPassword(coachDTO.getPassword());
		coachEntity.setSpeciality(coachDTO.getSpeciality());
		coachEntity = coachRepository.save(coachEntity);
		return coachEntity.getCoachId();
	}
//	
//	public boolean loginCoach(LoginDTO loginDTO) {
//		return false;
//	}
//	
//	public CoachDTO getCoachProfile(String CoachId) {
//		CoachEntity coachEntity = new CoachEntity();
//		coachEntity = coachRepository.findByCoachId(CoachId);
//		CoachDTO coachDTO = new CoachDTO();
//		coachDTO.setCoachId(coachEntity.getCoachId());
//		coachDTO.setDateOfBirth(coachEntity.getDateOfBirth());
//		coachDTO.setGender(coachEntity.getGender());
//		coachDTO.setMobileNumber(coachEntity.getMobileNumber());
//		coachDTO.setName(coachEntity.getName());
//		coachDTO.setSpeciality(coachEntity.getSpeciality());		
//		return coachDTO;
//	}

}
