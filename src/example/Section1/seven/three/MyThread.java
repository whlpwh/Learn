package example.Section1.seven.three;

public class MyThread extends Thread{

	@Override
	public void run(){
		try {
			for (int i = 0; i < 500000; i++) {
				if(this.interrupted()){
					System.out.println("�߳��Ѿ���ֹ��");
					throw new InterruptedException();
				}
				System.out.println("i = "+ (i+1));
			}
			System.out.println("for each ֹͣ�� �� ����ķ�������ִ�С�");
		} catch (InterruptedException e) { 
			e.printStackTrace();
			System.out.println("ִ���쳣����������");
		}
	}
}
