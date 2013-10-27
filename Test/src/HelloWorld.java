

public class HelloWorld {
    /**
     * @param args
     */
    public static void main(String[] args) {
    	//new Kill().run();
    	Motors.m1.setPower(50);
    	Motors.m2.setPower(50);
    	//Motors.movement.setRotateSpeed(90);
    	Routine r=new ForwardLeft();
    	while(!r.finished())
    		r.loop();
    	System.exit(0);
        //System.out.println("Hello World!");
        //Button.waitForAnyPress();
    }
}