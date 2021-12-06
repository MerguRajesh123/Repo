package com.dnapass.java.training.interfaces;

public class MountainBike extends Bicycle {

	private static final int MountainBikeSpeedAdjustment = 5;
	private String suspension;

	public MountainBike(int startCadence, int startGear, int startSpeed, String newSuspenion) 
	{
		super(startCadence, startGear, startSpeed);
		this.setSuspension(newSuspenion);
	}

	public String getSuspension() {
		return suspension;
	}

	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}

	public void adjustSpeed()
	{
		super.speedUp(super.getSpeed()-MountainBikeSpeedAdjustment);
	}

	@Override
	public void printDescription() {
		super.printDrescription();
		System.out.println("MountainBike Suspension :"+this.getSuspension());
		
	}

	@Override
	public void specific(int decrement) {
		// TODO Auto-generated method stub
		
	}

}