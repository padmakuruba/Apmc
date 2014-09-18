package autom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Creation {
	public WebDriver driver;
  @Test(description="creation of e-notice")
  public void f()throws Exception {
	  driver.findElement(By.xpath("//a/span[contains(text(),'E-Notice')]")).click();
	  Thread.sleep(2000);
	 // driver.findElement(By.xpath("//td/em[@unselectable='on']/button[contains(text(),'New Record')]")).click();
	 // driver.findElement(By.xpath("//td/em/button[@id='ext-gen122']")).click();
	  driver.switchTo().frame("4078_IFrame");
	  driver.findElement(By.xpath("//button[contains(text(),'New Record')]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//img[@id='ext-gen194']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//td[@class='x-btn-center']/em[@unselectable='on']/button[contains(text(),'September 2014')]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//td[@class='x-date-mp-month x-date-mp-sep']/a[contains(text(),'Oct')]")).click();
	  driver.findElement(By.xpath("//td[@class='x-date-mp-year x-date-mp-sel']/a[contains(text(),'2014')]")).click();
	  driver.findElement(By.xpath("//td/button[@class='x-date-mp-ok']")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'17')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//textarea[@id='NoticeBoardWindow_txtMessage']")).sendKeys("Welcome to Manvi");
	  driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	// driver.findElement(By.xpath("////tbody/tr/td[@class='x-btn-center']/em/button[@class='x-btn-text')]")).click();
	 //driver.findElement(By.xpath("//td/em/button[@class='x-btn-text']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//td/em/button[contains(text(),'OK')]")).click();
	  driver.findElement(By.xpath("//td/em/button[contains(text(),'Close')]")).click();
	  Thread.sleep(1000);
	 // driver.findElement(By.xpath("//a[contains(text(),'LogOff')]")).click();
//	  driver.findElement(By.xpath("//div/span/img[@class='ext-gen42']")).click();
	  
	  
  }
  @BeforeClass
  public void beforeClass()throws Exception {
	  driver = new FirefoxDriver();
	  driver.get("http://192.168.1.124:85");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("afzalpurapmc");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("vsspl");
	  driver.findElement(By.xpath("//button[@id='ext-gen16']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//div/span[contains(text(),'Administration ')]")).click();
	  
	  
	  }

  @AfterClass
  public void afterClass()throws Exception {
  driver.findElement(By.xpath("//div/span/img[@class='ext-gen42']")).click();
  Thread.sleep(1000);
  driver.close();
  }

}
