package example.Section1.seven.two;

public class Run2 {

 
	//isInterrupted ���Ե���ִ���̵߳��Ƿ��ж� ��û�����״̬λ����
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
//			thread.interrupt();
			Thread.currentThread().interrupt();
			System.out.println("�Ƿ��Ѿ�ֹͣ1��" +thread.isInterrupted());
			System.out.println("�Ƿ��Ѿ�ֹͣ2��" +thread.isInterrupted());
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
