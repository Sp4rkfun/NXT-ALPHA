package com.cyberbullies.state;

import com.cyberbullies.movement.Bridge;
import com.cyberbullies.movement.Routine;

public class Startup {
    /**
     * @param args
     */
    public static void main(String[] args) {
    	//new Kill().run();
    	Motors.m1.setPower(50);
    	Motors.m2.setPower(50);
    	//Motors.movement.setRotateSpeed(90);
    	//was forward left
    	Routine r=new Bridge(true,1000);
    	while(!r.finished())
    		r.loop();
    	System.exit(0);
        //System.out.println("Hello World!");
        //Button.waitForAnyPress();
    }
}