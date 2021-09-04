package com.example.rcp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rcp.domain.Members;
import com.example.rcp.mapper.MembersMapper;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MembersMapper membersMapper;

	@Override
	public Members getInfo(int memberId) throws Exception {
		membersMapper.findById(memberId);
		return null;
	}

}