package com.dnapass.java.training.interfaces;

public interface Horn {
	default void turnAlarmOn()
	{
		System.out.println("turning the cycle bell on");
	}
	default void turnAlarmOff()
	{
		System.out.println("turning the cycle bell on");
	}
}