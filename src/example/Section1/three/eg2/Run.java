package example.Section1.three.eg2;

public class Run {

	//测试调用 currentThread 获取当前调用的线程
	public static void main(String[] args) {
		
		CountOperate countOperate = new CountOperate();
		
		Thread a = new Thread(countOperate,"A");
		
//		a.start();
		a.run();
		
		
	}
}
