package com.jinwoo.chatting.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jinwoo.chatting.controller.MemberController;
import com.jinwoo.chatting.dto.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
    
	@Inject
	private SqlSession sqlSession;
	private static final String NameSpace="com.example.mapper.memberMapper";
	@Override
	public List<MemberVO> selectMember() throws Exception {
		// TODO Auto-generated method stub
		
		return sqlSession.selectList(NameSpace+".selectMember");
	}

	@Override
	public MemberVO doLogin(MemberVO inVO) throws Exception{
		logger.info("MemberDAO id"+inVO.getUser_id());
		return sqlSession.selectOne(NameSpace+".doLogin", inVO); 
	}

	@Override
	public int doJoin(MemberVO inVO) throws Exception {
		logger.info("MemberDAO id"+inVO.getUser_id());
		
		return sqlSession.insert(NameSpace+".doJoin",inVO);
	}
	
	
}
