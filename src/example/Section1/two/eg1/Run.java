package example.Section1.two.eg1;
 

public class Run {

	/**
	 * �� runnable ʵ�ֶ��߳�
	 * @param args
	 */
	public static void main(String[] args) {
//		MyRunnable myRennable = new MyRunnable();
//		Thread myThread = new Thread(myRennable);
//		myThread.start();
//		System.out.println("���н���");
		
		Thread mt = new Thread(new MyThread());
		
		mt.start();
	}
}
