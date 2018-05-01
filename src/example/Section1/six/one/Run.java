package example.Section1.six.one;

public class Run {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		
		System.out.println("name: " +thread.getName()+ " ,id: "+thread.getId());
		
	}
}
