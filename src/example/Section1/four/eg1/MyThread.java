package example.Section1.four.eg1;

public class MyThread extends Thread {

	@Override
	public  void run (){
		System.out.println("this.isAlive() £º"+this.isAlive());
	}
}
