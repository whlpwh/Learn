package example.Section1.two.eg3;
/**
 * ���ݹ���
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
//	public void run(){//���̰߳�ȫ��
	synchronized public void run(){//�̰߳�ȫ��
		super.run();
			count--;
			System.out.println("�� "+this.currentThread().getName()+" ���㣬count=" +count);
	}
}
