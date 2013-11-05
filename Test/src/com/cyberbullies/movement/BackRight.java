package com.cyberbullies.movement;

import com.cyberbullies.state.Motors;

public class BackRight extends Routine {
	public BackRight(){
		super();
		
	}

	@Override
	public void loop() {
		switch (step) {
		case 0:
			if(Motors.movement.isMoving()){
				if(Motors.ts.isPressed()){
					Motors.movement.forward();
					reset();
					step++;
				}
				
			}
		else{
			Motors.movement.backward();
		}
			break;
		case 1:
			if (delta()>400){
				Motors.movement.stop();
				Motors.movement.rotate(-90, false);
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
