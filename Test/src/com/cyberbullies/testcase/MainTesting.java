package com.cyberbullies.testcase;

import lejos.nxt.Sound;

import com.cyberbullies.movement.BackLeft;
import com.cyberbullies.movement.Collect;
import com.cyberbullies.movement.ForwardLeft;
import com.cyberbullies.movement.ForwardRight;
import com.cyberbullies.movement.Pickup;
import com.cyberbullies.movement.Routine;
import com.cyberbullies.state.Motors;
import com.cyberbullies.testcase.Bump;

public class MainTesting {
    /**
     * @param args
     */
    public static void main(String[] args) {
    	//new Kill().run();
    	Motors.m1.setPower(100);
    	Motors.m2.setPower(100);
    	Motors.m3.setPower(30);
    	int i = 3;
    	//Motors.movement.setRotateSpeed(90);
    	//was forward left
    	Routine r=new Pickup();
    	while(!r.finished())
    		r.loop();
    	switch (i) {
		case 1:	    	
	    	r=new BackLeft();
	    	while(!r.finished())
	    		r.loop();

			break;
		case 2:	    	
	    	r=new BackLeft();
	    	while(!r.finished())
	    		r.loop();
	    	r=new ForwardLeft();
	    	while(!r.finished())
	    		r.loop();
			break;
		case 3:	    	
	    	r=new BackLeft();
	    	while(!r.finished())
	    		r.loop();
	    	r=new ForwardRight();
	    	while(!r.finished())
	    		r.loop();
			break;

		default:
			break;
		}
    	r=new Collect();
    	while(!r.finished())
    		r.loop();
    	/*r=new Pickup();
    	while(!r.finished())
    		r.loop();
    	
    	/*r=new ForwardLeft();
    	while(!r.finished())
    		r.loop();*/
    	System.exit(0);
        //System.out.println("Hello World!");
        //Button.waitForAnyPress();
    }
}