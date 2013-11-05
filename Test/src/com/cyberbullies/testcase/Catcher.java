package com.cyberbullies.testcase;

import com.cyberbullies.movement.Routine;
import com.cyberbullies.state.Motors;


public class Catcher extends Routine {

	@Override
	public void loop() {
		switch (step) {
		case 0:
			if(Motors.m3.isMoving()){
				if(delta()>5000){
					Motors.m3.backward();
					reset();
					step++;
				}
				
			}
		else{
			Motors.m3.forward();
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
