package example.Section1.five.eg1;

public class Run {
 
	//slpee
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.setName("A");
		
		System.out.println("begin : " + System.currentTimeMillis());
//		myThread.run(); //����ͬ�����е�ʱ��this�ֶδ��������
		myThread.start();//�����첽���е�ʱ��this�ֶδ����Ҳ�Ƕ��������������Լ��͵�����һ��������������һ����
		System.out.println("end : " + System.currentTimeMillis());
	}

}
