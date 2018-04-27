package example.Section1.two.eg5;

public class Run {

	//还是会出现线程安全问题 ，因为print方法虽然是同步的，但是i--是进入方法前执行的所以还会有线程安全问题
	//为防止线程安全问题还是应该使用同步方法
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
