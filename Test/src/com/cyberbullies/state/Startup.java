package com.cyberbullies.state;


public class Startup {
    /**
     * @param args
     */
    public static void main(String[] args) {
    	//new Kill().run();
    	Motors.m1.setPower(80);
    	Motors.m2.setPower(80);
    	//Motors.movement.setRotateSpeed(90);
    	//was forward left
    	//Routine r=new Bridge(true,1000);
    	Motors.movement.rotate(90, false);
    	//Routine r=new Catcher();
//    	/while(!r.finished())
    	//	r.loop();
    	System.exit(0);
        //System.out.println("Hello World!");
        //Button.waitForAnyPress();
    }
}