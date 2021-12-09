package com.dnapass.java.trainig.inheritance.bicycle;

public class TestBikes {

	public static void main(String[] args) {
		Bicycle bike01=new Bicycle(20,10,1);
		MountainBike bike02=new MountainBike(20,10,5,"Dual");
		RoadBike bike03=new RoadBike(40,20,8,23);
		bike01.printDiscription();
		bike02.printDiscription();
		bike03.printDiscription();
	}
}