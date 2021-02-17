package com.simplilearn.accessmodifiers;


public class ProtectedAccModifierTest {

	public static void main(String[] args) {
		
		// create object
		Hero hero = new Hero();
		
		// print variable
		System.out.println("Power :: "+hero.power);
		
		// methods
		hero.showPower();
		
		hero.usePower();

	}

}
