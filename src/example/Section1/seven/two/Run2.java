package example.Section1.seven.two;

public class Run2 {

 
	//isInterrupted 测试的是执行线程的是否中断 且没有清除状态位功能
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
//			thread.interrupt();
			Thread.currentThread().interrupt();
			System.out.println("是否已经停止1：" +thread.isInterrupted());
			System.out.println("是否已经停止2：" +thread.isInterrupted());
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
