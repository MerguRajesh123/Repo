package com.dnapass.java.training.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// create a empty hash set
		Set<String> colors=new HashSet<String>();
		
		//use add method to add elements into the hash set
		colors.add("Red");
		colors.add("Green");
		colors.add("Black");
		colors.add("white");
		colors.add("Pink");
		colors.add("Yellow");
		
		// print the hash set
		System.out.println("the Hash set"+colors);

		
		//Iterator<String> p=colors.iterator();
		// Iterate the hash set
		//while(p.hasNext()) {
		//	System.out.println(p.hasNext());
		//}
		
		
		System.out.println("size of the hash set"+colors.size());
		System.out.println("checking the above array list is empty or not!"+colors.isEmpty());
	    
		//remove all elements
				colors.removeAll(colors);
			    System.out.println("hash set after removing all elements"+colors);
			    System.out.println("checking the above array list is empty or not!"+colors.isEmpty());
	    
         
			  //create an array
			    String[] new_array=new String[colors.size()];
			    colors.toArray(new_array);
			    
			    //displaying the array elements
			    System.out.println("Array elements");
			    for(String element:new_array) {
			    	System.out.println(element);
			    }
			    
			  //create a TreeSet of HashSet elements
			    
			    Set<String> tree_set=new TreeSet<String>(colors);
			    
			    //Display TreeSet elements
			    System.out.println("TreeSet elements");
			    for(String element:tree_set) {
			    	System.out.println(element);
			    }
			    
			  //create a List from HashSet elements
			    List<String> list=new ArrayList<String>();
			    
			    //display arrayList elements
			    System.out.println("ArrayList contains"+list);
			    
			    HashSet<String> h_set2=new HashSet<String>();
			    h_set2.add("Red");
			    h_set2.add("Pink");
			    System.out.println("second HasSet content"+h_set2);
			    colors.retainAll(h_set2);
			    System.out.println("HashSet content");
			    System.out.println(colors);
			    
			    
			  //colors.removeAll(h_set2);
			    
			    //colors.clear();
			    
			    //display original HashSet content
			    System.out.println("Hashset content"+colors);
			    
			    String[] args1= {"a","a","b","c","d","e","b"};
			    
			    Set<String> uniques=new HashSet<String>();
			    Set<String> dups=new HashSet<String>();
			    
			    for(String a:args1)
			    	if(!uniques.add(a))
			    		dups.add(a);
			    uniques.removeAll(dups);
			    System.out.println("unique words"+uniques);
			    System.out.println("duplicate words"+dups);
			    
			    Set<String> s=new HashSet<String>();
			    for(String a:args1)
			    	s.add(a);
			    System.out.println(s.size()+"distinct words");
			    
				
	}

}