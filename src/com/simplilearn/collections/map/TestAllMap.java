package com.simplilearn.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestAllMap {

	public static void main(String[] args) {
		
		Map<String, String> phoneBook = new HashMap<String, String>();
		
		phoneBook.put("John", "8437654465");
		phoneBook.put("Mike", "9437654444");
		phoneBook.put("Amit", "9945354444");
		phoneBook.put("Vijay", "9845354444");
		phoneBook.put(null, "9945354444");
		
		System.out.println(phoneBook);
		
		// access data from map
		System.out.println(phoneBook.get("Amit"));
		System.out.println(phoneBook.get("Vijay"));
		
		// Iteration over map
		// 1. fetch all keys
		Set<String> allKeys = phoneBook.keySet();
		
//		System.out.println(allKeys);
		// 2. use key to get value
		for(String key : allKeys) {
			System.out.println(key + " :-> "+ phoneBook.get(key));
		}

		
		// HashTable 
		Map<String, Double> listOfItems = new Hashtable<String, Double>();
		
		listOfItems.put("Apple", 44.5);
		listOfItems.put("Orange", 4.5);
		listOfItems.put("Banana", 20.5);
		listOfItems.put("Oils", 124.5);
		listOfItems.put("Wheat", 234.5);
		
		System.out.println(listOfItems);
		
		
		Map<Integer, String> listOfEmployee = new TreeMap<Integer, String>();
		listOfEmployee.put(101,"John Doe");
		listOfEmployee.put(102,"Mike Smith");
		listOfEmployee.put(103,"William Doe");
		listOfEmployee.put(104,"Marry Doe");
		listOfEmployee.put(105,"Vijay Doe");
		
		System.out.println(listOfEmployee);
		
		// Get a set of all entries		
		Collection entrySet = listOfEmployee.entrySet();
		
		// Obtain an Iterator for map entries		
		Iterator itr = entrySet.iterator();
		
		// use while loop with iterator
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
