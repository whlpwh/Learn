package example.Section1.seven.five;

import javax.management.RuntimeErrorException;

public class Run {

	//ʹ��stop ����ȷʵ����ֹͣ�߳�����
	public static void main(String[] args)  {
		try{
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(8*1000);
			thread.stop();
		}catch(InterruptedException e){
			throw new RuntimeException();
		}
		
		
	}

}
