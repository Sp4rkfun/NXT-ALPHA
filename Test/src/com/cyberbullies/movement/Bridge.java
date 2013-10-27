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
			if(Motors.m1.isMoving()&&Motors.m2.isMoving()){
				if(System.currentTimeMillis()>time){
					Motors.m1.stop();
					Motors.m2.stop();
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
				Motors.m1.stop();
				Motors.m2.stop();
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
