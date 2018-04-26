package example.Section1.two.eg1;
 

public class Run {

	/**
	 * 用 runnable 实现多线程
	 * @param args
	 */
	public static void main(String[] args) {
//		MyRunnable myRennable = new MyRunnable();
//		Thread myThread = new Thread(myRennable);
//		myThread.start();
//		System.out.println("运行结束");
		
		Thread mt = new Thread(new MyThread());
		
		mt.start();
	}
}
