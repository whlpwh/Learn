package example.Section1.seven.seven;

public class SynchronizedObject {
	private String username = "A";
	
	private String password = "AA";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	synchronized public void printString(String username , String password) {
		try {
			this.username = username ;
			Thread.sleep(10*1000);
			this.password = password;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 

}
