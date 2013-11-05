package com.cyberbullies.movement;

import com.cyberbullies.state.Motors;

public class ForwardRight extends Routine {
	public ForwardRight(){
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
					break;
				}		
			}
		else{
			Motors.movement.forward();
		}
			break;
		case 1:
			if(delta()>500){
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
		return this.step==2;
	}
}