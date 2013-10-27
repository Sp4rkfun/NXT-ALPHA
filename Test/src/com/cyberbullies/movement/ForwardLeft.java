package com.cyberbullies.movement;

import com.cyberbullies.state.Motors;

public class ForwardLeft extends Routine {
	public ForwardLeft(){
		super();
		
	}

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
			if (delta()>500){
				Motors.movement.rotate(90, false);
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
