package com.dong.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dong.domain.Permission;
import com.dong.mapper.PermissionMapper;
import com.dong.service.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService {
	
	@Autowired
	private PermissionMapper permissionMapper;

	@Override
	public List<String> queryPermissionsByUserId(Integer userid) {
		
		List<Permission> permissionList=permissionMapper.queryPermissionsByUserId(userid);
		List<String> permissions=new ArrayList<String>();
		
		for (Permission permission : permissionList) {
			permissions.add(permission.getPercode());
		}
		return permissions;
	}


}
