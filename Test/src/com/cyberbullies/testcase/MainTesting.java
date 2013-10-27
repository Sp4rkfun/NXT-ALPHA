package com.cyberbullies.testcase;

import lejos.nxt.Sound;

import com.cyberbullies.movement.Routine;
import com.cyberbullies.state.Motors;
import com.cyberbullies.testcase.Bump;

public class MainTesting {
    /**
     * @param args
     */
    public static void main(String[] args) {
    	//new Kill().run();
    	Motors.m1.setPower(50);
    	Motors.m2.setPower(50);
    	//Motors.movement.setRotateSpeed(90);
    	//was forward left
    	Sound.setVolume(50);
    	Routine r=new Bump();
    	while(!r.finished())
    		r.loop();
    	System.exit(0);
        //System.out.println("Hello World!");
        //Button.waitForAnyPress();
    }
}