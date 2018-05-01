package example.Section1.seven.four;

public class MyThread extends Thread{

	 @Override
	 public void run(){
		 try {
			 System.out.println("run begin");
			 Thread.sleep(2*1000);
			 System.out.println("run start");
		 } catch (InterruptedException e) {
			 System.out.println("在沉睡的时候被杀掉！！！进入catch! 判断是不是被停止"+this.interrupted());
			 e.printStackTrace();
		 }
	 }

}
