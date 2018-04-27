package example.Section1.two.eg4;

public class LoginServlet {
	
	private static String usernameRef ;
	private static String passwordRef;
	
	synchronized public static void doPost(String username , String password){
		try {
			usernameRef = username;
			if("A".equals(username)){
				Thread.sleep(2000);
			}
			passwordRef = password;
			System.out.println("username = "+usernameRef +",password = " + passwordRef ); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
