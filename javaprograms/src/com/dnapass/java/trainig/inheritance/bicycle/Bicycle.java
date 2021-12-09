package com.dnapass.java.trainig.inheritance.bicycle;

public class Bicycle {
	private int cadence;
    private int gear;
    private int speed;
    private boolean valid;
    
    public Bicycle(int startCadence,int startSpeed,int startGear) {
    	
    	cadence=startCadence;
    	speed=startSpeed;
    	gear=startGear;
    }
    public void applyBrakes(int decrement)
    {
    	speed-=decrement;
    }
    public void speedUp(int increment)
    {
    	speed+=increment;
    }
    
	public void printDiscription() {
    System.out.println("\nBike is"+"in gear"+this.gear+"with a cadence of"+this.cadence+"and travelling at a speed of"+this.speed+" ");
	}
	/**
	 * @return the cadence
	 */
	public int getCadence() {
		return cadence;
	}
	/**
	 * @param cadence the cadence to set
	 */
	public void setCadence(int cadence) {
		this.cadence = cadence;
	}
	/**
	 * @return the gear
	 */
	public int getGear() {
		return gear;
	}
	/**
	 * @param gear the gear to set
	 */
	public void setGear(int gear) {
		this.gear = gear;
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	public boolean isValid() {
		return valid;
	}
	
}
