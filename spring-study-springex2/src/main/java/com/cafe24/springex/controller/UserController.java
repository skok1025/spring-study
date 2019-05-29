package com.cafe24.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 *  @RequestMapping
 *  type + method
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value="/join", method = RequestMethod.GET)
	//@GetMapping("/join") 완전 동일
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}

	@RequestMapping(value = {"/join","/j"},  method = RequestMethod.POST)
	//@PostMapping({"/join","/j"})
	public String join(@ModelAttribute UserVo vo) {
		if(!valid(vo)) {
			return "/WEB-INF/views/join.jsp";
		}
		System.out.println(vo);
		return "redirect:/hello";
	}
	
	private boolean valid(UserVo vo) {
		return false;
	}
	
}
