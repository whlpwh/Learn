package example.Section1.one.eg3;

public class run {

	//Thread start 方法为通知CPU 我已经准备好运行了  你抽个时间运行下  
	//但是不能掉run方法  调用run方法 是走的同步方法  故start 是异步的
	public static void main(String[] args) {
		MyThread mt1 = new MyThread(1);
		MyThread mt2 = new MyThread(2);
		MyThread mt3 = new MyThread(3);
		MyThread mt4 = new MyThread(4);
		MyThread mt5 = new MyThread(5);
		MyThread mt6 = new MyThread(6);
		MyThread mt7 = new MyThread(7);
		MyThread mt8 = new MyThread(8);
		MyThread mt9 = new MyThread(9);
		
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
		mt5.start();
		mt6.start();
		mt7.start();
		mt8.start();
		mt9.start();
		
	}
}
