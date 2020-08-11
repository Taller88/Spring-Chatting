package com.jinwoo.chatting.dao;

import java.util.List;

import com.jinwoo.chatting.dto.MemberVO;

public interface MemberDAO {
	public List<MemberVO> selectMember() throws Exception;
	public MemberVO doLogin(MemberVO inVO) throws Exception;
	public int doJoin(MemberVO inVO) throws Exception;
	
}
