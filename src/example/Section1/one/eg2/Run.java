package example.Section1.one.eg2;

public class Run {

	/**
	 * �����̵߳������
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			MyThread myThread = new MyThread();
			myThread.setName("MyThread");
			myThread.start();
			
			for (int i = 0; i < 10 ; i++) {
				int time = (int)(Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("main = "+ Thread.currentThread().getName()+" ִ�д�����"+i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
