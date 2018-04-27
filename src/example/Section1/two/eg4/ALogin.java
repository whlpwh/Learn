package example.Section1.two.eg4;

public class ALogin extends Thread{

	@Override
	public  void run(){
		LoginServlet.doPost("A", "AA");
	}
}
