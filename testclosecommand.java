package Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclosecommand {

	/**
	 * @param args
	 */
static WebDriver d;
	
	public static void invokebrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\selenium tools\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		d.get("https://www.flipkart.com/");
		closebrowser();
	}
	public static void closebrowser()
	{
		//d.close();
		d.get("https://www.facebook.com/");
		d.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testclosecommand  o=new testclosecommand();
	invokebrowser();

	}

}
