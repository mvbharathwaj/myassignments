package week1.day2;

public class Browser {
	public void launchBrowser(String browsername) {
		System.out.println("browser lauched successfully:"+browsername);
	}
	public void loadUrl() {
		System.out.println("Application Url loaded");
	}
	public static void main(String[] args) {
		Browser browser=new Browser();
		browser.launchBrowser("Google Chrome");
		browser.loadUrl();
		
		
		
		
	}

}
