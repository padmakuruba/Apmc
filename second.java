package examples;
//import FirefoxDriver;


//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import sample.login.sampletest;
import methods.login_tc;

public class second {
	public WebDriver driver;
	@Test
	public void creation()throws Exception 	 {
		  
		login_tc.signin("afzalpur", "vsspl");
		login_tc.admin_click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a/span[text()='Details Of Committee']")).click();
		
	
		  
	}
	
}

