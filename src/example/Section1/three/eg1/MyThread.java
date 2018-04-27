package example.Section1.three.eg1;


public class MyThread extends Thread{
	 
	public MyThread(){
		
		System.out.println("构造方法："+ Thread.currentThread().getName());
		
	}

	
	@Override
	public void run(){
		System.out.println("Run方法"+Thread.currentThread().getName());
	}
}
