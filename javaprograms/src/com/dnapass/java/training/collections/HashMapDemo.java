package com.dnapass.java.training.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
		hash_map.put(1,"red");
		hash_map.put(2, "black");
		hash_map.put(3, "white");
		System.out.println(hash_map);
		for(Entry<Integer,String> x:hash_map.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		System.out.println("size of the hash map:"+hash_map.size());

		//create two hashmaps
		HashMap<Integer,String> hash_map1=new HashMap<Integer,String>();
		HashMap<Integer,String> hash_map2=new HashMap<Integer,String>();
		
		hash_map1.put(1,"red");
		hash_map1.put(2, "black");
		hash_map1.put(3,"brown");
		System.out.println("\nvalues in the first hash map:"+hash_map1);
		

		hash_map2.put(1,"Blue");
		hash_map2.put(2, "Green");
		hash_map2.put(3,"pink");
		System.out.println("\nvalues in the second hash map:"+hash_map2);
		
		//put all values in second Hash map
		hash_map2.putAll(hash_map1);
		System.out.println("\n now values in the second hash map:"+hash_map2);
		
		//remove all the elements from the linked hash map
		//hash_map.clear();
		//System.out.println("the new map:"+hash_map);
		
		//check if map is empty
		boolean result=hash_map.isEmpty();
		System.out.println("is hash map empty:"+result);
		
		
		
		HashMap<Integer,String> new_hash_map=new HashMap<Integer,String>();
		new_hash_map=(HashMap<Integer,String>)hash_map.clone();
		System.out.println("cloned map:"+new_hash_map);
		
		
		System.out.println("1.Is key 'green' exists?");
		if(hash_map.containsKey("green")) {
			System.out.println("yes!="+hash_map.get("green"));
		}else
			System.out.println("no!");
		
		
		

		System.out.println("\n2.Is key 'black' exists?");
		if(hash_map.containsKey("green")) {
			System.out.println("yes!="+hash_map.get("black"));
		}else
			System.out.println("no!");
		
		
		System.out.println("1.Is value\'green\' exists?");
		if(hash_map.containsValue("green")) {
			System.out.println("yes!");
		}else
			System.out.println("no!");
		
		

		System.out.println("\n2.Is value\'orange\' exists?");
		if(hash_map.containsValue("orange")) {
			System.out.println("yes!");
		}else
			System.out.println("no!");
		
		//create set view for map
		
		Set set=hash_map.entrySet();
		System.out.println("Set values"+set);
		
		//get value of key 3
		String val=(String)hash_map.get(3);
		System.out.println("value for key 3 is:"+val);
		
		//get keyset value for map
		Set keyset=hash_map.keySet();
		System.out.println("key set values are:"+keyset);
		
		//checking collection view of the map
		System.out.println("collection view is:"+hash_map.values());
		
		
		
		
			
	}

}