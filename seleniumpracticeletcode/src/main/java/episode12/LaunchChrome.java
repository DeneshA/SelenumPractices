package episode12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChrome {
	
	public static void main(String[] args) {
		//WebDriver driver = null;
		String driverOption ="Ch";
		switch(driverOption) {
		case "ch":	 
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		break;
		
		case "fx":
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		break;
	}
		driver.get("https://ultimateqa.com/complicated-page");
	}

}
