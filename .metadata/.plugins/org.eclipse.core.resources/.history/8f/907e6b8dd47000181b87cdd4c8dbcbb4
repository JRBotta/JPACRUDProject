package com.skilldistillery.jpacrud.data;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.skilldistillery.jpacrud.entities.Hero;

@Transactional
@Component
public class HeroDAOImpl implements HeroDAO{
	
	@PersistenceContext
	private EntityManager em;

	public Hero getHeroById(int heroid) {
		return em.find(Hero.class, heroid);
	}
	
	public void newHero(Hero hero) {
		em.persist(hero);
	}
}