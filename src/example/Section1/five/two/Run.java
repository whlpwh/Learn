package example.Section1.five.two;

public class Run {
 
	
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		System.out.println("main begin:"+ System.currentTimeMillis());
		
		mt.start();
		
		System.out.println("main end:"+ System.currentTimeMillis());
		
	}

}
 