package example.Section1.three.eg2;

public class CountOperate extends Thread{

	
    public CountOperate() {
    	System.out.println("Count Operate begin");
    	System.out.println("Thread.currentThread().getName() : "+Thread.currentThread().getName());
    	System.out.println("this.getName() : " + this.getName());
    	System.out.println("Count Operate end");
    	
	}
	
	@Override
	public void run() {
		System.out.println("run begin");
		System.out.println("Thread.currentThread().getName() : "+Thread.currentThread().getName());
		System.out.println("this.getName() : " + this.getName()); // this自生的线程
		System.out.println("run end");
	}
	
	
}
