package Final_Weather;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Package1.Utility;
import Package1.Weather_Base;


public class Final_weather extends Weather_Base{
	
	@Test
	public void showtime() {
	Utility u = new Utility(dr);
	u.forcastToday();
		
		
	}
	
	

}
