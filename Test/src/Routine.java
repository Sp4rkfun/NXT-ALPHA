
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
	abstract void loop();
	
	abstract boolean finished();
}
