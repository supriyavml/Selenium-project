package webdriver1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RadioButtonInteraction {


		public static void main(String[] args) throws InterruptedException 
		{
			//System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Download\\geckodriverV19\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			
			String baseURL = "http://www.calculator.net/mortgage-payoff-calculator.html";
			WebDriver driver;
			
			
			System.setProperty("webdriver.ie.driver","C:\\Selenium\\Download\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(baseURL);
			WebElement E1, E2, E3;
			
			
			//driver.findElement(By.id("lst-ib")).sendKeys("gmail.com");
			//driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
			//driver.findElement(By.className("gb_P")).click();
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
		      // Click on Radio Button
		/*driver.findElement(By.id("cpayoff1")).click();
		
		System.out.println("The Output of the IsSelected " + driver.findElement(By.id("cpayoff1")).isSelected());
		System.out.println("The Output of the IsEnabled " + driver.findElement(By.id("cpayoff1")).isEnabled());
		System.out.println("The Output of the IsDisplayed " + driver.findElement(By.id("cpayoff1")).isDisplayed());*/

		      //Close the Browser.
		 driver.close();
		   }
		}

