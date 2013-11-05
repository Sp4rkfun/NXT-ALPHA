package com.cyberbullies.movement;

import com.cyberbullies.state.Motors;

public class Collect extends Routine {
	public Collect(){
		super();
		
	}

	@Override
	public void loop() {
		switch (step) {
		case 0:
			if(Motors.movement.isMoving()){
				if(Motors.tsf.isPressed()){
					Motors.movement.backward();
					reset();
					step++;
				}
				
			}
		else{
			Motors.movement.forward();
		}
			break;
		case 1:
			if (delta()>400){
				Motors.movement.stop();
				Motors.m3.forward();
				step++;
			}
			break;
		case 2:
			if (delta()>2900){
				Motors.m3.stop();
				step++;
			}
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