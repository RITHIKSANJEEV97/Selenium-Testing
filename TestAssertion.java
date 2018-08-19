package testNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.*;

public class TestAssertion {
	static WebDriver d;
	  @BeforeTest()
	  public void invokebrowser() {
		  System.setProperty("webdriver.chrome.driver","E:\\selenium\\selenium tools\\chromedriver_win32\\chromedriver.exe");
		  d=new ChromeDriver();
		  d.manage().window().maximize();
		  d.manage().deleteAllCookies();
		  d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  d.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		  d.get("https://www.gmail.com");
		  }
  @Test
  public void Assert()
  {
	  String title=d.getTitle();
	  AssertJUnit.assertEquals(title,"Gmail");
	  System.out.print("true");
  }
  @AfterTest
  public void close()
  {
	  d.quit();
  }
  
}
