package com.zhang.springmvc.service.security;

import com.zhang.springmvc.web.utils.Page;

public interface UserService {
	
	public Page findUser(int start, int limit);

}
