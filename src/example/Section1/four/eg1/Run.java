package example.Section1.four.eg1;

public class Run {

	
	//isAlive() 判断当前线程是否处于活动状态  活动状态是 线程已经启动且尚未终止。线程处于正在运行或准备开始运行的状态
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		
		System.out.println("Begin thread.isAlive " + thread.isAlive());
		
//		thread.run();
		
		thread.start();
		
		Thread.sleep(1000);
		
		System.out.println("End thread.isAlive " + thread.isAlive());
		
		
	}
}
