package webdriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefoxtest {

	public static void main(String[] args) 
	{
		String baseURL = "http://google.com";
		WebDriver driver;

		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Download\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get(baseURL);
		
		
		// TODO Auto-generated method stub
		

	}

}