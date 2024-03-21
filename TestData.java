package OOPsAssignment3;

public class TestData {

	public void entercredientials() {
		System.out.println("enter the credientials");
	}
	public void navigatetohomepage() {
		System.out.println("Logged in");
	}
	
	public static void main(String[] args) {
		TestData  td = new TestData();
		td.entercredientials();
		td.navigatetohomepage();
	}
}
