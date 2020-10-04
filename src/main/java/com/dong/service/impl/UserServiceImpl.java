package com.dong.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dong.domain.User;
import com.dong.mapper.UserMapper;
import com.dong.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	

	@Override
	public User queryUserByUserName(String username) {
		User user=userMapper.queryUserByUserName(username);
		return user;
	}

}
