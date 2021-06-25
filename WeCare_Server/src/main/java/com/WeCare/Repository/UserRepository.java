package com.WeCare.Repository;

import org.springframework.data.repository.CrudRepository;

import com.WeCare.Entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity,String>{
	public UserEntity findyByUserId(String UserId);

}
