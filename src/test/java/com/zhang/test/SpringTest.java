package com.zhang.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhang.springmvc.domain.security.User;
import com.zhang.springmvc.mapper.security.UserMapper;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper = (UserMapper) context.getBean("userMapper");
		PageHelper.offsetPage(1, 10);
		List<User> users = userMapper.findAllUser();
		PageInfo<User> info = new PageInfo<>(users);
		System.out.println(info.getTotal());
		for (User user : users) {
			System.out.println(user);
		}
	}

}
