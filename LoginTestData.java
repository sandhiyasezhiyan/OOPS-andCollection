package OOPsAssignment3;

public class LoginTestData extends TestData {

	public void enterusername() {
		System.out.println("enter the username");
	}
	
	public void enterpassword() {
		System.out.println("enter the password");
	}
	
	public static void main(String[] args) {
		LoginTestData ltd = new LoginTestData();
		ltd.enterusername();
		ltd.enterpassword();
		ltd.entercredientials();
		ltd.navigatetohomepage();
	}
}
