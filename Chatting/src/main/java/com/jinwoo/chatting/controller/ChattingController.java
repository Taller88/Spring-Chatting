package com.jinwoo.chatting.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.socket.WebSocketSession;

import com.jinwoo.chatting.dto.MemberVO;

@Controller
public class ChattingController {

	@RequestMapping(value="chatting/chatting.spring", method = RequestMethod.POST)
	public ModelAndView chat(HttpServletRequest req,ModelAndView mv, MemberVO inVO) {
		mv.setViewName("chatting/chattingView");
		System.out.println("정진우: "+inVO.getUser_id());
		System.out.println("정진우: "+inVO.getName());
		System.out.println("정진우: "+inVO.getNo());
		
		HttpSession session=req.getSession();
		session.setAttribute("member", inVO.getUser_id());
		
		mv.addObject("session",session);
		mv.addObject("member", inVO);
		
		return mv;
	}
}
