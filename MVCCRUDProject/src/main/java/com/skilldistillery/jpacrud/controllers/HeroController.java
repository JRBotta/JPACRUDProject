package com.skilldistillery.jpacrud.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.jpacrud.data.HeroDAO;
import com.skilldistillery.jpacrud.entities.Dice;
import com.skilldistillery.jpacrud.entities.DndClass;
import com.skilldistillery.jpacrud.entities.Hero;
import com.skilldistillery.jpacrud.entities.Race;

@Controller
public class HeroController {

	@Autowired
	HeroDAO dao;

	@RequestMapping(path = "index.do", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		List<Hero> heroes = dao.getAllHeroes();
		mv.addObject("heroes", heroes);
		mv.setViewName("WEB-INF/intro.jsp");
		return mv;
	}

	@RequestMapping(path = "getHero.do", method = RequestMethod.GET)
	public ModelAndView displayHero(int heroid) {
		ModelAndView mv = new ModelAndView();
		List<DndClass> classList = new ArrayList<DndClass>( Arrays.asList(DndClass.values() ));
		mv.addObject("classList", classList);
		List<Race> raceList = new ArrayList<Race>( Arrays.asList(Race.values() ));
		mv.addObject("raceList", raceList);
		mv.setViewName("WEB-INF/herodetails.jsp");
		Hero hero = dao.getHeroById(heroid);
		mv.addObject("hero", hero);
		return mv;
	}

	@RequestMapping(path = "updateHero.do", method = RequestMethod.POST)
	public ModelAndView updateHero(Hero hero) {
		ModelAndView mv = new ModelAndView();
		List<DndClass> classList = new ArrayList<DndClass>( Arrays.asList(DndClass.values() ));
		mv.addObject("classList", classList);
		List<Race> raceList = new ArrayList<Race>( Arrays.asList(Race.values() ));
		mv.addObject("raceList", raceList);
		Hero managed = dao.updateHero(hero);
		mv.setViewName("WEB-INF/herodetails.jsp");
		mv.addObject("hero", managed);
		return mv;
	}

	@RequestMapping(path = "createHero.do", method = RequestMethod.POST)
	public ModelAndView createHero() {
		ModelAndView mv = new ModelAndView();
		List<DndClass> classList = new ArrayList<DndClass>( Arrays.asList(DndClass.values() ));
		mv.addObject("classList", classList);
		List<Race> raceList = new ArrayList<Race>( Arrays.asList(Race.values() ));
		mv.addObject("raceList", raceList);
		mv.setViewName("WEB-INF/createhero.jsp");
		return mv;
	}
	
	
	@RequestMapping(path = "deleteHero.do", method = RequestMethod.POST)
	public ModelAndView deleteHero(int heroid) {
		ModelAndView mv = new ModelAndView();
		dao.deleteHero(heroid);
		mv.setViewName("redirect:index.do");
		return mv;
	}

	@RequestMapping(path = "created.do", method = RequestMethod.POST)
	public ModelAndView created(Hero hero, String roll) {
		ModelAndView mv = new ModelAndView();
		if(roll.equals("true")) {
			hero.setCharisma(Dice.rollStats());
			hero.setStrength(Dice.rollStats());
			hero.setDexterity(Dice.rollStats());
			hero.setConstitution(Dice.rollStats());
			hero.setWisdom(Dice.rollStats());
			hero.setIntelligence(Dice.rollStats());	
		}
		dao.newHero(hero);
		mv.setViewName("WEB-INF/herodetails.jsp");
		mv.addObject("hero", hero);
		return mv;
	}
}
