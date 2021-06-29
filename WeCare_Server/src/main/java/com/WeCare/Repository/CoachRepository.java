package com.WeCare.Repository;

import org.springframework.data.repository.CrudRepository;

import com.WeCare.Entity.CoachEntity;

public interface CoachRepository extends CrudRepository<CoachEntity, String>{
	public CoachEntity findByCoachId(String coachId);
	public CoachEntity findByMobileNumber(Long mobileNumber);
}
