package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		
		// List  :-> Ordered collection with duplicate elements
		// List :-> Is a Interface, (List Implementation Classes : ArrayList , LinkedList, Vector, Stack)
		
//		List<String> list1 = new ArrayList<String>();
//		List<String> list2 = new LinkedList<String>();
//		List<String> list3 = new Vector<String>();
//		List<String> list4 = new Stack<String>();
		
		List<String> nameList = new ArrayList<String>();
		
		// add data in array list
		nameList.add("John");  // index 0
		nameList.add("Mike");
		nameList.add("David");
		nameList.add("William");
		nameList.add("Bob");
		nameList.add("Ajay");
		nameList.add("William");
		
		System.out.println(nameList);
		
		// get element by index
		System.out.println(nameList.get(3));
		System.out.println(nameList.get(2));
		
		// remove element
		nameList.remove(3);
		System.out.println(nameList);
		
		// replace element
		nameList.set(1, "Anand");
		System.out.println(nameList);
		
		// add at index
		nameList.add(1, "Madhu");
		System.out.println(nameList);
		
		// Iteration Over List
		
		// 1. Iteration By Iterator
		Iterator<String> itr = nameList.iterator();
		while(itr.hasNext()) {
			System.out.println("Name :=> "+ itr.next());
		}
		
		System.out.println("---------------------------");
		
		// 2. For with Counter
		for (int index = 0; index < nameList.size(); index++) {
			System.out.println("Name :=> "+ nameList.get(index));
		}
		
		System.out.println("---------------------------");
		
		// 3. Enhanced For Loop
		for(String name : nameList) {
			System.out.println("Name :=> "+ name);
		}
	}

}
