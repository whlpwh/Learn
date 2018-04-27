package example.Section1.four.eg2;

public class CountOperate extends Thread {

	public CountOperate() {
		System.out.println("count operate begin");
		System.out.println("Thread.currentThread().getName() £º "+Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive() : "+Thread.currentThread().isAlive());
		System.out.println("this.getName() : "+this.getName());
		System.out.println("this.isAlive() : "+ this.isAlive());
		System.out.println("count operate end");
	}

	@Override
	public void run(){
		System.out.println("run  begin");
		System.out.println("Thread.currentThread().getName() £º "+Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive() : "+Thread.currentThread().isAlive());
		System.out.println("this.getName() : "+this.getName());
		System.out.println("this.isAlive() : "+ this.isAlive());
		System.out.println("run end");
	}
}
