package example.Section1.two.eg5;

public class MyThread extends Thread {
	
	private int i = 5;
	
	@Override
	public void run(){
		
		//֮ǰ i-- �������У�Ŀǰ��Ϊ����print ������ֱ�Ӵ�ӡ
		System.out.println("i = "+i-- + " thread name : " + Thread.currentThread().getName());
	}

}
