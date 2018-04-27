package example.Section1.three.eg1;

public class Run {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		
		myThread.run();//相当于同步调用
		
		myThread.start();//异步调用
		
	}
}
