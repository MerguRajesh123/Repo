package com.dnapass.java.training.interfaces;

public class TestBike  {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Bicycle b1= new RoadBike(20,6,10,2);
		Bicycle clone=(Bicycle) b1.clone();
		Bicycle b2= new RoadBike(30,4,500,5);
		Bicycle b3= new MountainBike(40,3,30,"Suspension_model1");
		RoadBike b4= new RoadBike(50,10,700,7) ;
		MountainBike b5= new MountainBike(60,5,80,"Suspension_model2");
		
		b1.printDrescription();
		b2.printDrescription();
		b3.printDrescription();
		b4.printDrescription();
		b5.printDrescription();
		
		demo1();
	}
	private static void demo1() {
		Cycle bike1 =new MountainBike(20,6,10,"Suspension_model3");
		Cycle bike2 =new RoadBike(20,6,10,9);
		
		bike1.printDescription();
		bike1.applyBrake(3);
		bike1.printDescription();
		bike1.speedUp(10);
		bike1.printDescription();
		bike1.turnAlarmOff();
		bike1.turnAlarmOn();
		Cycle.speedupInKmh(100,50);
		
		bike2.printDescription();
		bike2.speedUp(3);
		bike2.printDescription();
		bike1.speedUp(7);
		bike2.printDescription();
		bike1.turnAlarmOff();
		bike1.turnAlarmOn();
	}

}