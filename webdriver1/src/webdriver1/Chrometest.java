package webdriver1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrometest {

	public static void main(String[] args) throws InterruptedException {

		String baseURL = "http://www.calculator.net/mortgage-payoff-calculator.html";
		WebDriver driver;
				
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Download\\chromedriver1.exe");
		//driver = new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver( options );
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
		WebElement E1, E2, E3;
		E1 = driver.findElement(By.name("cloanamount"));
		E1.clear();
		E1.sendKeys("2500");
		
		E2 = driver.findElement(By.id("cpayoff3"));
		E2.click();
		System.out.println(E2.isDisplayed());
		System.out.println(E2.isEnabled());
		System.out.println(E2.isSelected());
		
		E3 = driver.findElement(By.id("cpayoff1"));
		E3.click();
		System.out.println(E2.isDisplayed());
		System.out.println(E2.isEnabled());
		System.out.println(E2.isSelected());
		
				
		Thread.sleep(3000);
		
		driver.close();
		
		/*driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Prac")).click();
		
		driver.findElement(By.id("benzradio")).click();
		System.out.println(driver.findElement(By.id("benzradio")).isSelected());*/
		 
	}

}
