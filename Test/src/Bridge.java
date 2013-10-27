
public class Bridge extends Routine {
	private boolean right;
	private boolean rotated;
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
	void loop() {
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
				if(right)
					Motors.movement.rotate(-90, rotated);
				else
				Motors.movement.rotate(90, rotated);
				step++;
			}
			break;

		default:
			break;
		}

	}

	@Override
	boolean finished() {
		return rotated;
	}

}
