package webdriver1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class IEdropdown {

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
		WebElement E1 = driver.findElement(By.id("name"));
		E1.isEnabled();
		
		Select carDrd = new Select(driver.findElement(By.name("cars")));
		carDrd.selectByIndex(1);
		
	}
}
