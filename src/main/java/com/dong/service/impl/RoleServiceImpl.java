package com.dong.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dong.domain.Role;
import com.dong.mapper.RoleMapper;
import com.dong.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public List<String> queryRolesByUserId(Integer userid) {
		List<Role> roleList=roleMapper.queryRolesByUserId(userid);
		List<String> roles=new ArrayList<String>();
		for (Role role : roleList) {
			roles.add(role.getRolename());
		}
		return roles;
	}

}
