package com.skilldistillery.jpacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.jpacrud.data.HeroDAO;

@Controller
public class HeroController {

	@Autowired
	HeroDAO dao;
	
	@RequestMapping(path = "index.do", method = RequestMethod.GET)
	public String index() {
	  return "WEB-INF/intro.html";
	}
	
	@RequestMapping(path="getHero.do", method = RequestMethod.GET)
	public ModelAndView displayHero(int heroid) {
		System.out.println("WEB-INF/herodetails.jsp");
		ModelAndView mv = new ModelAndView();
		
		return mv;
	}
}