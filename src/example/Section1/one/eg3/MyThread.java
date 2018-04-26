package example.Section1.one.eg3;

public class MyThread extends Thread{
	
	int i ;
	
    public MyThread(int i) {
    	this.i = i;
	}
	
	@Override
	public void run(){
		System.out.println(i);
	}

}
