package com.cyberbullies.movement;

import com.cyberbullies.state.Motors;


public class Pickup extends Routine {

	@Override
	public void loop() {
		switch (step) {
		case 0:
			Motors.m3.forward();
			if(delta()>2000){
				step++;
				Motors.m3.stop();
			}
			break;
			

		default:
			break;
		}
	}

	@Override
	public boolean finished() {
		return step==1;
	}

}