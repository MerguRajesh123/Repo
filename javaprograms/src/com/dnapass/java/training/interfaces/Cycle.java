package com.dnapass.java.training.interfaces;

public interface Cycle {

	double kmh=3.6;
	double mph=2.356479587;
	double fts=3.568475398;
	void applyBrake(int decrement);
	void speedUp(int increment);
	void printDescription();
	default void turnAlarmOn()
	{
		System.out.println("turning the cycle bell on");
	}
	default void turnAlarmOff()
	{
		System.out.println("turning the cycle bell off");
	}
	
	static void parkCycle() {
		System.out.println("Cycle parked.");
	}
	static double speedupInKmh(double distanceInMeter,int timeInSeconds)
	{
		return kmh*distanceInMeter/timeInSeconds;
	}
	static double speedupInMph(double distanceInMeter,int timeInSeconds)
	{
		return kmh*distanceInMeter/timeInSeconds;
	}
	static double speedupInFts(double distanceInMeter,int timeInSeconds)
	{
		return kmh*distanceInMeter/timeInSeconds;
	}
}