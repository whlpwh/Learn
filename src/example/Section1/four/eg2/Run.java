package example.Section1.four.eg2;

public class Run {

	//判断线程是否存活
    public static void main(String[] args) {
    	CountOperate co = new CountOperate();
    	Thread t = new Thread(co ,"A");
    	System.out.println("t begin: " + t.isAlive());
    	t.start();
    	System.out.println("t end: " + t.isAlive());
	}
}
