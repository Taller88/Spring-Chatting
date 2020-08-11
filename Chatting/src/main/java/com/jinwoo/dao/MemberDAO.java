package com.jinwoo.dao;

import java.util.List;

import com.jinwoo.dto.MemberVO;

public interface MemberDAO {
	public List<MemberVO> selectMember() throws Exception;
	public MemberVO doLogin(MemberVO inVO) throws Exception;
}
