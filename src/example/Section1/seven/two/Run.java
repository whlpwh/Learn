package example.Section1.seven.two;

public class Run {

	//interrupted �������Ե��ǵ�ǰ�߳� ������main�����е��õľ���main���̡߳�
	//�� interrupted�����������״̬��־ ����һ�κ�״̬���
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
//			thread.interrupt();
			Thread.currentThread().interrupt();
			System.out.println("�Ƿ��Ѿ�ֹͣ1��" +thread.interrupted());
			System.out.println("�Ƿ��Ѿ�ֹͣ2��" +thread.interrupted());
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
