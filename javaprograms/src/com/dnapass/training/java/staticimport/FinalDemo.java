package com.dnapass.training.java.staticimport;

public class FinalDemo {
    static final int MAX_WIDTH;
    final int i;
    {
   	 //i=0
    }
    FinalDemo(){
   	i=0;
    }
    static {
   	MAX_WIDTH=999;
    }
    static class Hello{
   	 final void sayHello() {
   		 System.out.println("Hello");
   	 }
    }
    static class World extends Hello {
   	void sayHello1() {
   		 System.out.println("World");
   	 }
    }
    public static void main(String[] args) {
		//final local variable
   	 final int i=10;
   	// i=100;
   	 //i=200;
   	 System.out.println(i);
   	 final World world=new World();
   	 world.sayHello();
   	 world.sayHello1();
   	 //world=new world();....we cant change world reference variable
	}
}
	

