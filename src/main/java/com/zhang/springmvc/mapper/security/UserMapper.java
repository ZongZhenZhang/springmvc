package com.zhang.springmvc.mapper.security;

import java.util.List;

import com.zhang.springmvc.domain.security.User;

public interface UserMapper {

	public List<User> findUser();
	
	public List<User> findAllUser();
	
	public int addUser(User user);

}
