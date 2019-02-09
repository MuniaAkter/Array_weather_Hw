package Package1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Utility {
		
		@FindBy(xpath="//*[@id=\"title\"]/span[1]/span[2]/span[1]") WebElement cloud;
		
		WebDriver dr;	
		public Utility (WebDriver dr){
			this.dr=dr;
			PageFactory.initElements(dr, this);
		}
		

		public void forcastToday1() {
			//System.out.println("hi");
			String forcast = cloud.getText();
		}

		public void forcastToday() {
			//System.out.println("hi");
			String forcast = cloud.getText();
			System.out.println(forcast);
			
			//System.out.println(forcast.replaceAll("[^0-9]", ""));
			
		}
	
}
