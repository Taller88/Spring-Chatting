package com.jinwoo.chatting.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.jinwoo.chatting.controller.MemberController;
import com.jinwoo.chatting.dao.MemberDAO;
import com.jinwoo.chatting.dto.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
    
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

	@Override
	public int doJoin(MemberVO inVO) throws Exception {
		return dao.doJoin(inVO);
	}
	
}
