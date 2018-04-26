package example.Section1.one.eg1;

public class Run {
	/**
	 * 第一啪
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		//不能多次调用 start方法
		//java.lang.IllegalThreadStateException
		//at java.lang.Thread.start(Unknown Source)
		//at example.Section1.one.Run.main(Run.java:12)
		//myThread.start();
		System.out.println("Main运行结束！！！");
	}
}
