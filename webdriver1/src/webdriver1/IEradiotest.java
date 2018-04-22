package webdriver1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEradiotest {
	

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Download\\geckodriverV19\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		String baseURL = "https://letskodeit.teachable.com";
		WebDriver driver;
				
		System.setProperty("webdriver.ie.driver","C:\\Selenium\\Download\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.findElement(By.linkText("Practice")).click();
		
		
		WebElement R1, C1;
		R1= driver.findElement(By.id("bmwradio"));
		R1.click();
		R1= driver.findElement(By.id("benzradio"));
		R1.click();
		R1= driver.findElement(By.id("hondaradio"));
		R1.click();
		
		C1= driver.findElement(By.id("bmwcheck"));
		C1.click();
		C1= driver.findElement(By.id("benzcheck"));
		C1.click();
		C1= driver.findElement(By.id("hondacheck"));
		C1.click();
		C1.click();

		
		}
		
	

}


