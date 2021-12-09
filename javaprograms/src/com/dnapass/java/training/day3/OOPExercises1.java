package com.dnapass.java.training.day3;

public class OOPExercises1 {


	public static void main(String[] args) {
		A objA = new A();
		System.out.println("in main(): ");
		System.out.println("objA.a = " + objA.getA());
		objA.setA(222);
	}



}
class A {
	private int a = 100;

	public void setA(int value) {
		a = value;
	}

	public int getA() {
		return a;
	}
} // class A