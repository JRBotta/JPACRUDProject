package com.skilldistillery.jpacrud.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Dice {
	public static int[] rolld4(int num) {
		int[] rolls = new int[num];
		for(int i = 0; i < num; i++) {
			rolls[i] = (int) (Math.random() * 4) + 1;
		}
		return rolls;
	}
	
	public static int[] rolld4() {
		return new int[] {(int) (Math.random() * 4) + 1};
	}
	
	public static int[] rolld6(int num) {
		int[] rolls = new int[num];
		
		for(int i = 0; i < num; i++) {
			rolls[i] = (int) (Math.random() * 6) + 1;
		}
		return rolls;
	}
	public static int rollStats() {
		List<Integer> dice = new ArrayList<>();
		for(int i = 0; i < 4; i++) {
			dice.add((int) (Math.random() * 6) + 1);
		}
		
		Collections.sort(dice);
		dice.remove(0);
		int total = 0;
		for (Integer integer : dice) {
			total += integer;
		}
		return total;
	}
	
	public static int[] rolld6() {
		return new int[] {(int) (Math.random() * 6) + 1};
	}
	
	public static int[] rolld10(int num) {
		int[] rolls = new int[num];
		for(int i = 0; i < num; i++) {
			rolls[i] = (int) (Math.random() * 10) + 1;
		}
		return rolls;
	}
	
	public static int[] rolld10() {
		return new int[] {(int) (Math.random() * 10) + 1};
	}
	
	public static int[] rolld12(int num) {
		int[] rolls = new int[num];
		for(int i = 0; i < num; i++) {
			rolls[i] = (int) (Math.random() * 12) + 1;
		}
		return rolls;
	}
	
	public static int[] rolld12() {
		return new int[] {(int) (Math.random() * 12) + 1};
	}
	
	public static int[] rolld20(int num) {
		int[] rolls = new int[num];
		for(int i = 0; i < num; i++) {
			rolls[i] = (int) (Math.random() * 20) + 1;
		}
		return rolls;
	}
	
	public static int[] rolld20() {
		return new int[] {(int) (Math.random() * 20) + 1};
	}
	
}
