package example.Section1.five.eg1;

public class MyThread extends Thread{
 
	@Override
	public void run(){
		try {
			System.out.println("run therad this.currentThread() name " + this.currentThread().getName() + " begin");
			System.out.println("run therad this.getName name " + this.getName() + " begin");
			Thread.sleep(2*1000);
			System.out.println("run therad this.currentThread() name " + this.currentThread().getName() + " end");
			System.out.println("run therad this.getName name " + this.getName() + " end");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
