package example.Section1.seven.one;

public class Run {

	public static void main(String[] args)  {
		
		try {
			MyThread mythread = new MyThread();
			mythread.start();

			mythread.interrupt();//�������ֹ�߳� ���� �����ǻ�ִ����
			Thread.sleep(2*10000);
			System.out.println("sleep");
			System.out.println("123");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("main catch");
		}
		
	}
}
