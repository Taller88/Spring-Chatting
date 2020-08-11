package com.jinwoo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jinwoo.dao.MemberDAO;
import com.jinwoo.dto.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO dao;
	
	@Override
	public List<MemberVO> selectMember() throws Exception {
		
		return dao.selectMember();
	}

	@Override
	public MemberVO doLogin(MemberVO inVO) throws Exception{
		return dao.doLogin(inVO);
	}
}
