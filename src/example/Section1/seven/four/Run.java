package example.Section1.seven.four;

public class Run {

	//���thread ��sleep����£�����interrupt��ֹ�̡߳��߳�����׳��쳣ֹͣ��
	//��֮һ�� ��interrupt��ֹ����� ����sleepҲ��һ���ġ�
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
