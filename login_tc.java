package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class login_tc {
	public static WebDriver driver;
  @Test
  @Parameters({"username","password"})
  public static void signin(String username,String password)throws Exception {
	  driver=new FirefoxDriver();
	  driver.get("http://192.168.1.124:85/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	  driver.findElement(By.xpath("//button[text()='Login']")).click(); 
  Thread.sleep(3000);
  }
  @Test
public static void admin_click(){
	  driver.findElement(By.xpath("//div/div/div/span")).click();
  }

}
