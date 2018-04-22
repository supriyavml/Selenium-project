package webdriver1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Googletest {
  private WebDriver driver;
  private String baseUrl;
 
  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.ie.driver","C:\\Selenium\\Download\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();

    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testGoogle() throws Exception {
    driver.get(baseUrl + "/search?source=hp&ei=tTJyWoqACIKkjwPO-qmQDg&q=letscodeit&oq=letscodeit&gs_l=psy-ab.3..0i10k1.8888.13146.0.13463.10.10.0.0.0.0.155.1183.0j10.10.0....0...1c.1.64.psy-ab..0.10.1175...0j0i131k1.0.zRztUsKDgdU");
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("");
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("");
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("letscodeit");
    driver.findElement(By.id("lst-ib")).clear();
    driver.findElement(By.id("lst-ib")).sendKeys("letscodeit");
    driver.findElement(By.linkText("Lets Kode it | Selenium")).click();
    driver.findElement(By.linkText("Lets Kode it | Selenium")).click();
    driver.findElement(By.id("DrpDwnMn01label")).click();
    driver.findElement(By.id("DrpDwnMn01label")).click();
  }

  @After
  public void tearDown() throws Exception {
	  Thread.sleep(3000);
    driver.quit();
  }

}
