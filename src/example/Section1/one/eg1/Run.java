package example.Section1.one.eg1;

public class Run {
	/**
	 * ��һž
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		//���ܶ�ε��� start����
		//java.lang.IllegalThreadStateException
		//at java.lang.Thread.start(Unknown Source)
		//at example.Section1.one.Run.main(Run.java:12)
		//myThread.start();
		System.out.println("Main���н���������");
	}
}
