package example.Section1.two.eg5;

public class MyThread extends Thread {
	
	private int i = 5;
	
	@Override
	public void run(){
		
		//之前 i-- 独立运行，目前改为放在print 方法中直接打印
		System.out.println("i = "+i-- + " thread name : " + Thread.currentThread().getName());
	}

}
