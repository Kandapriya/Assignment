package week1.day2;

public class Browser {
	public String launchbrowser(String browsername) {
		System.out.println("Browser Launched Successfully");
		return browsername;
		}
private void loadurl() {
	System.out.println("Application url loadedsuccessfully");
}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Browser B1 = new Browser();
		String mybrowser = B1.launchbrowser("Chrome");
		System.out.println(mybrowser);
		B1.loadurl();
		

		
	}

}
