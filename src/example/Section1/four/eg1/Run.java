package example.Section1.four.eg1;

public class Run {

	
	//isAlive() �жϵ�ǰ�߳��Ƿ��ڻ״̬  �״̬�� �߳��Ѿ���������δ��ֹ���̴߳����������л�׼����ʼ���е�״̬
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		
		System.out.println("Begin thread.isAlive " + thread.isAlive());
		
//		thread.run();
		
		thread.start();
		
		Thread.sleep(1000);
		
		System.out.println("End thread.isAlive " + thread.isAlive());
		
		
	}
}
