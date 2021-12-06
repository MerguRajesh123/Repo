package com.dnapass.java.training.interfaces;

public class RoadBike extends Bicycle {
	
	private static final int RoadBikeSpeedAdjustment = 2;
	private int tireWidth;
	

	public RoadBike(int startCadence, int startGear, int startSpeed, int newTireWidth) 
	{
		super(startCadence, startGear, startSpeed);
		this.setTireWidth(newTireWidth);
	}

	public int getTireWidth() {
		return tireWidth;
	}

	public void setTireWidth(int tireWidth) {
		this.tireWidth = tireWidth;
	}

	@Override
	public void printDescription() {
		super.printDrescription();
		System.out.println("RoadBike TireWidth :"+this.getTireWidth());	
		
	}

	public void adjustSpeed()
	{
		super.speedUp(super.getSpeed()-RoadBikeSpeedAdjustment);
	}
	@Override
	public void specific(int decrement) {
		// TODO Auto-generated method stub
		
	}
}