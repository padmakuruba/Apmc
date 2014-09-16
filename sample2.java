package examples;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sample2 {
	public static WebDriver driver;
  @Test
  @Parameters({"username","password"})
	  public static void signin(String username,String password) {
		  driver=new FirefoxDriver();
		  driver.get("http://192.168.1.124:85/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		  driver.findElement(By.xpath("//button[text()='Login']")).click();
	  }
	}
  }
}
