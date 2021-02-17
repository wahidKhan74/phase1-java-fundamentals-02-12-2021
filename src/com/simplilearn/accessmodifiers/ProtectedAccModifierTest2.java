package com.simplilearn.accessmodifiers;

import com.simplilearn.accessB.Hero;

public class ProtectedAccModifierTest2 extends Hero{

	public static void main(String[] args) {
		
		// create object
		ProtectedAccModifierTest2 hero = new ProtectedAccModifierTest2();
		
		// print variable
		System.out.println("Power :: "+hero.power);
		
		// methods
		hero.showPower();
		
		hero.usePower();

	}

}
