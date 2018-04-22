package webdriver1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEtest {


		public static void main(String[] args) 
		{
			//System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Download\\geckodriverV19\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			
			String baseURL = "http://google.com";
			WebDriver driver;
			
			
			System.setProperty("webdriver.ie.driver","C:\\Selenium\\Download\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(baseURL);
			WebElement E1;
			
			
			//driver.findElement(By.id("lst-ib")).sendKeys("gmail.com");
			//driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
			//driver.findElement(By.className("gb_P")).click();
			E1 = driver.findElement(By.className("gb_P"));
			E1.click();
			
			
		}
		
		
		
		

}
