package example.Section1.two.eg5;

public class Run {

	//���ǻ�����̰߳�ȫ���� ����Ϊprint������Ȼ��ͬ���ģ�����i--�ǽ��뷽��ǰִ�е����Ի������̰߳�ȫ����
	//Ϊ��ֹ�̰߳�ȫ���⻹��Ӧ��ʹ��ͬ������
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		
		Thread  a = new Thread(myThread,"A");
		Thread  b = new Thread(myThread,"B");
		Thread  c = new Thread(myThread,"C");
		Thread  d = new Thread(myThread,"D");
		Thread  e = new Thread(myThread,"E");
		
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
}
