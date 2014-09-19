package autom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class General_Ledger {
	public WebDriver driver;
	
	
	
	@Test()
  public void f()throws Exception {
	  driver.findElement(By.xpath("//em[@unselectable='on']/button[contains(text(),'New Record')]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div/input[@id='JournalLedgerAccountCreationWindow_txtAccountName']")).sendKeys("Man ");
	  driver.findElement(By.xpath("//img[@id='ext-gen184']")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//div[@class='x-combo-list-inner']/div[contains(text(),'Trader')]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//td/div/input[@class=' x-form-text x-form-field x-form-num-field smalltxtBoxwidth']")).sendKeys("8000");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//td/em[@unselectable='on']/button[contains(text(),'Save')]")).click();
	 try
	 {
		 WebDriverWait wait = new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ext-mb-text']")));
		
		 WebElement g = driver.findElement(By.xpath("//span[contains(text(),'Account details has been saved successfully')]"));
		 String str = g.getText();
		 System.out.println(str);
		 Assert.assertEquals("Account details has been saved successfully", str);
	 }
	 catch(Exception e)
	 {
		 System.out.println("failed"+e.getMessage());
	 }
	  
  }
  @BeforeTest
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.get("http://192.168.1.124:85");
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("bidarapmc");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("vsspl");
	  driver.findElement(By.xpath("//td/em[@unselectable='on']/button[contains(text(),'Login')]")).click();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//div[@class='x-panel-header x-unselectable x-accordion-hd']/span[contains(text(),'Accounts')]")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a/span[contains(text(),'General Ledger')]")).click();
	  driver.switchTo().frame("3024_IFrame");
  }

  @AfterTest
  public void afterClass() {
  }

}
