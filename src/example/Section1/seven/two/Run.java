package example.Section1.seven.two;

public class Run {

	//interrupted 方法测试的是当前线程 所以在main方法中调用的就是main的线程。
	//且 interrupted方法具有清除状态标志 调用一次后状态清除
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
//			thread.interrupt();
			Thread.currentThread().interrupt();
			System.out.println("是否已经停止1：" +thread.interrupted());
			System.out.println("是否已经停止2：" +thread.interrupted());
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
