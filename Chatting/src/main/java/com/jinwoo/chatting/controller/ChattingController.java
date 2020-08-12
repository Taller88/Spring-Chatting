package com.jinwoo.chatting.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jinwoo.chatting.dto.MemberVO;

@Controller
public class ChattingController {

	@RequestMapping(value="chatting/chatting.spring", method = RequestMethod.POST)
	public ModelAndView chat(HttpServletRequest req,ModelAndView mv, MemberVO inVO) {
		mv.setViewName("chatting/chattingView");
		
		mv.addObject("userId", req.getParameter("userId"));
		
		return mv;
	}
}
