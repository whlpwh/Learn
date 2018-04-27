package example.Section1.five.eg1;

public class Run {
 
	//slpee
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.setName("A");
		
		System.out.println("begin : " + System.currentTimeMillis());
//		myThread.run(); //当是同步运行的时候，this字段代表对象本身。
		myThread.start();//当是异步运行的时候，this字段代表的也是对象本身，但是由于自己和调用是一个对象所以名字一样的
		System.out.println("end : " + System.currentTimeMillis());
	}

}
