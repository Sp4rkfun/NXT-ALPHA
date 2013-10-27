public class BackRight extends Routine {
	public BackRight(){
		super();
		
	}

	@Override
	void loop() {
		switch (step) {
		case 0:
			if(Motors.m1.isMoving()&&Motors.m2.isMoving()){
				if(Motors.ts.isPressed()){
					Motors.m1.forward();
					Motors.m2.forward();
					reset();
					step++;
				}
				
			}
		else{
			Motors.m1.backward();
			Motors.m2.backward();
		}
			break;
		case 1:
			if (delta()>500){
				Motors.movement.rotate(-90, false);
				step++;
			}
			break;

		default:
			break;
		}
		
	}

	@Override
	boolean finished() {
		return step==2;
	}
}
