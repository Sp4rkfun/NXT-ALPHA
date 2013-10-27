package com.cyberbullies.testcase;

import lejos.nxt.Sound;

import com.cyberbullies.state.Motors;


public class Bump extends com.cyberbullies.movement.Routine {

	@Override
	public void loop() {
		switch (step) {
		case 0:
			if(Motors.m1.isMoving()&&Motors.m2.isMoving()){
				if(Motors.tsf.isPressed()){
					Motors.m1.backward();
					Motors.m2.backward();
					reset();
					step++;
				}
				
			}
		else{
			Motors.m1.forward();
			Motors.m2.forward();
		}
			break;
		case 1:
			Sound.beep();
			if (delta()>500){
				Motors.m1.stop();
				Motors.m2.stop();

				Sound.beepSequenceUp();
				step++;
			}
			break;

		default:
			break;
		}
		
	}

	@Override
	public boolean finished() {
		return step==2;
	}

}
