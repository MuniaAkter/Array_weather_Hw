package Package1;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Weather_Base {
	 WebDriver dr;
	
	@Before
	public void openbrower() {
		dr= new ChromeDriver ();
		dr.get("https://darksky.net");
		
		
		
		
		
	}
	
	
	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		dr.quit();
	}

}
