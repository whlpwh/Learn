package example.Section1.seven.seven;

public class Run {

	//如图例所示 强制停止可能会造成数据不一致 且 stop是不建议使用的
	public static void main(String[] args) {
		try {
			SynchronizedObject obj = new SynchronizedObject();
			MyThread thread = new MyThread(obj);
			thread.start();
			Thread.sleep(500);
			thread.stop();
			System.out.println(obj.getUsername() + obj.getPassword());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
