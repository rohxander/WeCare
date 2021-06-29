package com.WeCare.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WeCare.DTO.CoachDTO;
import com.WeCare.DTO.LoginDTO;
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
	
	public boolean loginCoach(LoginDTO loginDTO) throws Exception{
		CoachEntity coachEntity = new CoachEntity();
		coachEntity = coachRepository.findByCoachId(loginDTO.getId());
		if(coachEntity==null) {
			throw new Exception("COACHID_NOT_FOUND");
		}
		else if(!coachEntity.getPassword().equals(loginDTO.getPassword())) {
			throw new Exception("CREDENTIALS_NOT_MATCH");
		}
		else {
			return true;
		}
	}
	
	public CoachDTO getCoachProfile(String CoachId) throws Exception {
		CoachEntity coachEntity = new CoachEntity();
		coachEntity = coachRepository.findByCoachId(CoachId);
		if(coachEntity==null) {
			throw new Exception("COACH_NOT_FOUND");
		}
		CoachDTO coachDTO = new CoachDTO();
		coachDTO.setCoachId(coachEntity.getCoachId());
		coachDTO.setDateOfBirth(coachEntity.getDateOfBirth());
		coachDTO.setGender(coachEntity.getGender());
		coachDTO.setMobileNumber(coachEntity.getMobileNumber());
		coachDTO.setName(coachEntity.getName());
		coachDTO.setSpeciality(coachEntity.getSpeciality());		
		return coachDTO;
	}
	
	public List<CoachEntity> showAllCoaches() throws Exception{
		List<CoachEntity> listEntity = new ArrayList<CoachEntity>();
		listEntity = coachRepository.findAll();
		if(listEntity==null) {
			throw new Exception("NO_COACHES_FOUND");
		}
//		List<CoachDTO> listDTO = new ArrayList<CoachDTO>();
		
		return listEntity;
	}
	
}
