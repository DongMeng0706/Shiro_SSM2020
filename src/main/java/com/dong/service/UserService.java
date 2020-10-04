package com.dong.service;

import com.dong.domain.User;

public interface UserService {

	/**
	 * 根据用户名查询用户对象
	 * @param username
	 * @return
	 */
	User queryUserByUserName(String username);

}
