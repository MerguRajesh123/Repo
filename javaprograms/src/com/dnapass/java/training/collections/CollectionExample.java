package com.dnapass.java.training.collections;

import java.util.TreeSet;

class CollectionExample {
	public static void maain(String[] args) { 
		TreeSet<Integer> numbers  = new TreeSet<>(); 
		numbers.add(20);
		numbers.add(50);
		numbers.add(40);  
		numbers.add(60); 
		System.out.println("Values: " + numbers. headSet(50)); 
	}
}