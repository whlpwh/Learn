package example.Section1.three.eg2;

public class Run {

	//���Ե��� currentThread ��ȡ��ǰ���õ��߳�
	public static void main(String[] args) {
		
		CountOperate countOperate = new CountOperate();
		
		Thread a = new Thread(countOperate,"A");
		
//		a.start();
		a.run();
		
		
	}
}
