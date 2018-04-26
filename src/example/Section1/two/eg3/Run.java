package example.Section1.two.eg3;

public class Run {

	
	public static void main(String[] args) {
//		MyThread a = new MyThread("A");
//		MyThread b = new MyThread("B");
//		MyThread c= new MyThread("C");
//		a.start();
//		b.start();
//		c.start();
		//非线程安全的
		ShareThread st = new ShareThread("A");
	     Thread a = new Thread(st,"A");
	     Thread b = new Thread(st,"B");
	     Thread c = new Thread(st,"C");
	     Thread d = new Thread(st,"D");
	     Thread e = new Thread(st,"E");
	     a.start();
	     b.start();
	     c.start();
	     d.start();
	     e.start();
		
		
	}
}
