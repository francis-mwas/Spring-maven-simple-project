package com.clc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MembersController {
	
	@RequestMapping("/register")
	public ModelAndView register(HttpServletRequest req, HttpServletResponse res) {
		
		String firstName = String.valueOf(req.getParameter("fname"));
		String lastName = String.valueOf(req.getParameter("lname"));
		String userName = String.valueOf(req.getParameter("uname"));
		String email = String.valueOf(req.getParameter("email"));
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("memberData.jsp");
		mv.addObject("firstName",  firstName);
		mv.addObject("lastName",  lastName);
		mv.addObject("userName",  userName);
		mv.addObject("email",  email);
	
		
		return mv;
		
	}

}
