package com.jinwoo.chatting;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jinwoo.chatting.controller.MemberController;
import com.jinwoo.chatting.dto.MemberVO;
import com.jinwoo.chatting.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
    
	@Inject
	MemberService memService;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception{
		logger.debug("???");
		logger.info("home");
		List<MemberVO> memList=memService.selectMember();
		model.addAttribute("memberList",memList);
		return "chatting/index";
	}
	
}
