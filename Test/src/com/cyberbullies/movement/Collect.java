package com.cyberbullies.movement;

import com.cyberbullies.state.Motors;

public class Collect extends Routine {

	@Override
	public void loop() {
		switch (step) {
		case 0:
			if(Motors.m1.isMoving()&&Motors.m2.isMoving()){
				if(Motors.us.getDistance()<25){
					//TODO: Slow down speed of motors to appropriate level
					Motors.m3.forward();
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
			if(Motors.tsf.isPressed()){
				Motors.m1.stop();
				Motors.m2.stop();
				reset();
				step++;
			}
			break;
		case 2:
			if(delta()>2500)
				step++;
			break;
			

		default:
			break;
		}
	}

	@Override
	public boolean finished() {
		return step==3;
	}

}
