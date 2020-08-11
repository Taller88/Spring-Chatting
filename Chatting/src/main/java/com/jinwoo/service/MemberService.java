package com.jinwoo.service;


import java.util.List;

import com.jinwoo.dto.MemberVO;
 
 
public interface MemberService {
    
    public List<MemberVO> selectMember() throws Exception;
    public MemberVO doLogin(MemberVO inVO) throws Exception;

}

