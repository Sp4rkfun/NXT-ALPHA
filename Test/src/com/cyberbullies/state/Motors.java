package com.cyberbullies.state;
import java.util.Vector;

import com.cyberbullies.movement.Routine;

import lejos.nxt.Motor;
import lejos.nxt.MotorPort;
import lejos.nxt.NXTMotor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.navigation.DifferentialPilot;


public class Motors {
	public static DifferentialPilot movement = new DifferentialPilot(40f, 225f, Motor.B, Motor.A);
	public static NXTMotor m1 = new NXTMotor(MotorPort.A);
	public static NXTMotor m2 = new NXTMotor(MotorPort.B);
	public static NXTMotor m3 = new NXTMotor(MotorPort.C);
	public static TouchSensor ts = new TouchSensor(SensorPort.S1);
	public static TouchSensor tsf = new TouchSensor(SensorPort.S3);
	public static UltrasonicSensor us = new  UltrasonicSensor(SensorPort.S2);
	public static Vector<Routine>process;
}

