package com.skilldistillery.jpacrud.data;

import com.skilldistillery.jpacrud.entities.Hero;

public interface HeroDAO {
	public void newHero(Hero hero);
	public Hero getHeroById(int heroid);
}