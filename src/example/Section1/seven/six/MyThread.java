package example.Section1.seven.six;

public class MyThread extends Thread{

	@Override
	public void run(){
		try {
			this.stop();
		} catch (ThreadDeath e) {
			System.out.println("进入catch方法!");
			e.printStackTrace();
		}
	}
 
}
