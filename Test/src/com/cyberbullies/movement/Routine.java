package com.cyberbullies.movement;

import com.cyberbullies.state.Motors;

public abstract class Routine {
	protected long time;
	protected int step=0;
	public Routine() {
		Motors.m1.stop();
		Motors.m2.stop();
		reset();
	}
	public int delta(){
		return (int) (System.currentTimeMillis()-time);
	}
	public void reset(){
		this.time=System.currentTimeMillis();
	}
	public abstract void loop();
	
	public abstract boolean finished();
}
