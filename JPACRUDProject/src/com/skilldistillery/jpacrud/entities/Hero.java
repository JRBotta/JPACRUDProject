package com.skilldistillery.jpacrud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hero {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;	
	@Column(name="class")
	private String dndClass;
	private String level;
	private String race;
	@Column(name="max_hp")
	private int maxHP;
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	@Column(name="current_hp")
	private int currentHP;
	@Column(name="temporary_hp")
	private int tempHP;
	@Column(name="personality_traits")
	private String personalityTraits;
	private String ideals;
	private String bonds;
	private String flaws;
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	private String name;
	@Override
	public String toString() {
		return "Hero [id=" + id + ", dndClass=" + dndClass + ", level=" + level + ", race=" + race + ", maxHP=" + maxHP
				+ ", strength=" + strength + ", dexterity=" + dexterity + ", constitution=" + constitution
				+ ", intelligence=" + intelligence + ", wisdom=" + wisdom + ", charisma=" + charisma + ", currentHP="
				+ currentHP + ", tempHP=" + tempHP + ", personalityTraits=" + personalityTraits + ", ideals=" + ideals
				+ ", bonds=" + bonds + ", flaws=" + flaws + ", name=" + name + "]";
	}
	// getters / setters begin
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDndClass() {
		return dndClass;
	}
	public void setDndClass(String dndClass) {
		this.dndClass = dndClass;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public int getMaxHP() {
		return maxHP;
	}
	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public int getConstitution() {
		return constitution;
	}
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getWisdom() {
		return wisdom;
	}
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	public int getCharisma() {
		return charisma;
	}
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
	public int getCurrentHP() {
		return currentHP;
	}
	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}
	public int getTempHP() {
		return tempHP;
	}
	public void setTempHP(int tempHP) {
		this.tempHP = tempHP;
	}
	public String getPersonalityTraits() {
		return personalityTraits;
	}
	public void setPersonalityTraits(String personalityTraits) {
		this.personalityTraits = personalityTraits;
	}
	public String getIdeals() {
		return ideals;
	}
	public void setIdeals(String ideals) {
		this.ideals = ideals;
	}
	public String getBonds() {
		return bonds;
	}
	public void setBonds(String bonds) {
		this.bonds = bonds;
	}
	public String getFlaws() {
		return flaws;
	}
	public void setFlaws(String flaws) {
		this.flaws = flaws;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//getters / setters end
}