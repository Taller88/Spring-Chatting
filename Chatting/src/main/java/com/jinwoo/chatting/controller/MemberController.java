package com.jinwoo.chatting.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jinwoo.dto.MemberVO;
import com.jinwoo.service.MemberService;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
    
	@Inject
	MemberService memService;
	
	@RequestMapping(value = "/asd", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception{
		
		logger.info("home");
		List<MemberVO> memList=memService.selectMember();
		model.addAttribute("memberList",memList);
		return "/chatting/index";
	}
	
	@RequestMapping(value="/chatting/login.spring", method=RequestMethod.GET)
	public String doLogin(HttpServletRequest req, Model model) throws Exception{
		logger.debug("=======================================");
		logger.debug("=doLogin/param");
		logger.debug("=doLogin/memberId:"+req.getParameter("userId"));
		logger.debug("=doLogin/password:"+req.getParameter("password"));
		logger.debug("=======================================");
		
		MemberVO inVO=new MemberVO();
//		inVO.setUser_id(req.getParameter("userId"));
//		inVO.setPassword(req.getParameter("password"));
		inVO.setUser_id("iod1124");
		inVO.setPassword("1234");
		
		MemberVO outVO=(MemberVO)this.memService.doLogin(inVO);
		if(outVO.getUser_id()==null || "".equals(outVO.getUser_id())) {
			model.addAttribute("loginFailure","아이디를 입력해주세요");
			return "chatting/login";
		}
		if(!outVO.getPassword().equals(inVO.getPassword())) {
			model.addAttribute("loginFailure","패스워드가 일치하지 않습니다.");
			return "chatting/login";
		}
		
		return "chatting/index";
	}
	
	
}
