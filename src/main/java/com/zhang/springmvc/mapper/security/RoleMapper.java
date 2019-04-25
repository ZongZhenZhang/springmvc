package com.zhang.springmvc.mapper.security;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.zhang.springmvc.domain.security.Role;

public interface RoleMapper {
	
	@Select("select * from role")
	public List<Role> findAllRoles();

}
