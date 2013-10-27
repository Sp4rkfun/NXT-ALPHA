
public class Kill extends Thread {
	private long time;
	public Kill() {
		this(60000);
    }
	public Kill(int time) {
		this.time=System.currentTimeMillis()+time;
    }
    public void run() {
    	if(System.currentTimeMillis()>this.time)
    		System.exit(0);
    	try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
