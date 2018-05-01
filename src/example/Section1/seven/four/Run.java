package example.Section1.seven.four;

public class Run {

	//如果thread 在sleep情况下，调用interrupt终止线程。线程则会抛出异常停止。
	//反之一样 在interrupt终止情况下 调用sleep也是一样的。
	 public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start(); 
			Thread.sleep(2*100);
			thread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
