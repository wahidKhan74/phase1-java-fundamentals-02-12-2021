package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class TestAllList {

	public static void main(String[] args) {
		
		// List as ArrayList :-> 
		/// ArrayList :- Internally it is back by dynamic array 
		
		List<String> listOfCompanies = new ArrayList<String>();
		listOfCompanies.add("DELL");
		listOfCompanies.add("Wipro");
		listOfCompanies.add("Simplilearn");
		listOfCompanies.add("ABC");
		
		System.out.println(listOfCompanies);
		
		// List as LinkedList :- 

		List<String> listOfCities = new LinkedList<String>();
		listOfCities.add("Mumbai");
		listOfCities.add("Pune");
		listOfCities.add("Hyderabad");
		listOfCities.add("Mumbai");
		
		//replace elem
		listOfCities.set(0, "Nagpur");
		System.out.println(listOfCities);
		System.out.println(listOfCities.get(1));
		
		
		// List as Vector
		List<String> listOfFruits = new Vector<String>();
		listOfFruits.add("Apple");
		listOfFruits.add("Orange");
		listOfFruits.add("Banana");
		listOfFruits.add("Apple");
		
		System.out.println(listOfFruits);
		System.out.println(listOfFruits.get(1));
		
		
		// Stack works as LIFO order
		Stack<String> stackOfCoins = new Stack<String>();
		stackOfCoins.push("10 RS");
		stackOfCoins.push("5 RS");
		stackOfCoins.push("2 RS");
		stackOfCoins.push("1 RS");
		stackOfCoins.push("20 RS");
		
		System.out.println(stackOfCoins.pop());
	}

}
