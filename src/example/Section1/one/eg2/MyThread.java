package example.Section1.one.eg2;

public class MyThread extends Thread{

	@Override
	public void run(){
		try {
			for (int i = 0; i < 10; i++) {
				int time = (int)(Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("run = " + Thread.currentThread().getName()+" Ö´ÐÐ´ÎÊý£º"+i);
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
