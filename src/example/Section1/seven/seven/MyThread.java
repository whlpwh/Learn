package example.Section1.seven.seven;

public class MyThread extends Thread{

	private SynchronizedObject object ;
	
	public MyThread(SynchronizedObject obj){
		super();
		this.object = obj ;
	}
	@Override
	public void run(){
		object.printString("B", "BB");
	}
}
