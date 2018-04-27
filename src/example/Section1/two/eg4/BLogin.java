package example.Section1.two.eg4;

public class BLogin extends Thread{

	@Override
	public void run(){
		
		LoginServlet.doPost("B","BB");
		
	}
	
}
