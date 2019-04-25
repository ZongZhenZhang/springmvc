package com.zhang.springmvc.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhang.springmvc.service.security.UserService;
import com.zhang.springmvc.web.utils.Page;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/list")
	public String index(@RequestParam(value = "start", required = true, defaultValue = "1") int start,
			@RequestParam(value = "limit", required = true, defaultValue = "10") int limit, ModelMap map) {
		Page page = userService.findUser(start, limit);
		long pn = page.getTotal()/limit;
		if(page.getTotal()%limit!=0)
			pn += 1;
		if (start < pn) {
			start += 1;
		} else {
			start = 1;
		}
		map.put("next", start);
		map.put("page", page);
		return "user/userList";
	}

	@RequestMapping("/test")
	public String test() {
		System.out.println("SUCCESS");
		return "homepage";
	}

}
