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
			if (delta()>500){
				Motors.movement.stop();
				if(!Motors.m1.isMoving()&&!Motors.m2.isMoving())
				Motors.movement.rotate(90, false);
					Motors.movement.stop();
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
