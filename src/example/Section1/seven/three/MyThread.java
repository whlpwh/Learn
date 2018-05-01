package example.Section1.seven.three;

public class MyThread extends Thread{

	@Override
	public void run(){
		try {
			for (int i = 0; i < 500000; i++) {
				if(this.interrupted()){
					System.out.println("线程已经终止。");
					throw new InterruptedException();
				}
				System.out.println("i = "+ (i+1));
			}
			System.out.println("for each 停止了 ， 下面的方法还会执行。");
		} catch (InterruptedException e) { 
			e.printStackTrace();
			System.out.println("执行异常方法！！！");
		}
	}
}
