package com.zhang.springmvc.service.security.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhang.springmvc.domain.security.User;
import com.zhang.springmvc.mapper.security.UserMapper;
import com.zhang.springmvc.service.security.UserService;
import com.zhang.springmvc.web.utils.Page;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public Page findUser(int start, int limit) {
		PageHelper.startPage(start, limit);
		List<User> users = userMapper.findAllUser();
		PageInfo<User> pageInfo = new PageInfo<>(users);
		long total = pageInfo.getTotal();
		return new Page(total, users);
	}

}
