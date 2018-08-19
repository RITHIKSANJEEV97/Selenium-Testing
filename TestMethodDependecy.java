package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestMethodDependecy {
	static WebDriver d;
  @Test()
  public void invokebrowser() {
	  System.setProperty("webdriver.chrome.driver","E:\\selenium\\selenium tools\\chromedriver_win32\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.manage().window().maximize();
	  d.manage().deleteAllCookies();
	  d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  d.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	  d.get("https://www.facebook.com");
	  }
  @Test(dependsOnMethods={"invokebrowser"})
  public void login()
  {
	 
	  d.findElement(By.id("email")).sendKeys("sajirocks1@gmail.com");
	  d.findElement(By.id("pass")).sendKeys("hai");
	  d.findElement(By.id("loginbutton")).submit();
  }
}
