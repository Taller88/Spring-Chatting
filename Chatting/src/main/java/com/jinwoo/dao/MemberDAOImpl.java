package com.jinwoo.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jinwoo.dto.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
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
		return sqlSession.selectOne(NameSpace+".doLogin"); 
	}
}
