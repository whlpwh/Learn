package example.Section1.seven.four;

public class MyThread extends Thread{

	 @Override
	 public void run(){
		 try {
			 System.out.println("run begin");
			 Thread.sleep(2*1000);
			 System.out.println("run start");
		 } catch (InterruptedException e) {
			 System.out.println("�ڳ�˯��ʱ��ɱ������������catch! �ж��ǲ��Ǳ�ֹͣ"+this.interrupted());
			 e.printStackTrace();
		 }
	 }

}
