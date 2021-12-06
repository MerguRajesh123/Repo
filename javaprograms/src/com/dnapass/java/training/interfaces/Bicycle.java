package com.dnapass.java.training.interfaces;

public abstract class Bicycle implements Cycle,Cloneable{
	int vehicleNo;
	int cadence;
	int gear;
	int speed;

	private static int Number = 1;

	static {
		System.out.println("WELCOME");
	}

	{
		// System.out.println("Vehicle Details:");

	}
	
	public void applyBrake(int decrement)
	{
		speed-=decrement;
	}
	public void speedUp(int increment)
	{
		speed+=increment;
	}
	public Bicycle(int startCadence, int startGear, int startSpeed) {
		this.vehicleNo = Number;
		Number++;
		this.cadence = startCadence;
		this.gear = startGear;
		this.speed = startSpeed;
	}

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int Number) {
		this.vehicleNo = Number;
	}

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public void printDrescription() {
		System.out.println(this.getVehicleNo() + ")  Bicycle Vehicle number :" + this.getVehicleNo() + "  Cadence :"
				+ this.getCadence() + "  Gear :" + this.getGear() + "  Speed :" + this.getSpeed());
	}
	
	abstract public void specific(int decrement);
}