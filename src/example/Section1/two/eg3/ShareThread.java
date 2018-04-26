package example.Section1.two.eg3;
/**
 * 数据共享
 * @author wh
 *
 */
public class ShareThread extends Thread{


	private int count = 5;
	
	public ShareThread(String name){
		
		super();
		this.setName(name);
	}
	
	@Override
//	public void run(){//非线程安全的
	synchronized public void run(){//线程安全的
		super.run();
			count--;
			System.out.println("由 "+this.currentThread().getName()+" 计算，count=" +count);
	}
}
