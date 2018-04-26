package example.Section1.two.eg3;
/**
 * 数据不共享
 * @author wh
 *
 */
public class MyThread extends Thread{


	private int count = 5;
	
	public MyThread(String name){
		
		super();
		this.setName(name);
	}
	
	@Override
	public void run(){
		super.run();
		while(count>0){
			count--;
			System.out.println("由 "+this.currentThread().getName()+" 计算，count=" +count);
		}
	}
}
