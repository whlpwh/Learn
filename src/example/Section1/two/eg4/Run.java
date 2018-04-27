package example.Section1.two.eg4;

public class Run {

	/**
	 * 测试线程不安全   一种解决方案  加同步锁
	 * @param args
	 */
	public static void main(String[] args) {
		ALogin a = new ALogin();
		
		BLogin b = new BLogin();
		
		
		a.start();
		
		b.start();
	}
}
