package example.Section1.seven.seven;

public class Run {

	//��ͼ����ʾ ǿ��ֹͣ���ܻ�������ݲ�һ�� �� stop�ǲ�����ʹ�õ�
	public static void main(String[] args) {
		try {
			SynchronizedObject obj = new SynchronizedObject();
			MyThread thread = new MyThread(obj);
			thread.start();
			Thread.sleep(500);
			thread.stop();
			System.out.println(obj.getUsername() + obj.getPassword());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
