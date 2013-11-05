package com.cyberbullies.movement;

import com.cyberbullies.state.Motors;

public class Bridge extends Routine {
	private boolean right;
	public Bridge(){
		this(true,3000);
	}
	public Bridge(int time){
		this(true, time);
	}
	public Bridge(boolean right){
		this(right,3000);
	}
	public Bridge(boolean right, int time){
		 this.right=right;
		 this.time=time+System.currentTimeMillis();
	}
	@Override
	public void loop() {
		switch (step) {
		case 0:
			if(Motors.movement.isMoving()){
				if(System.currentTimeMillis()>time){
					Motors.movement.stop();
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
				if(this.right)
					Motors.movement.rotate(-90, false);
				else
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
