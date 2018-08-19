package Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testnavigatecommand {

	/**
	 * @param args
	 */
	static WebDriver d;
	public void invokebrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\selenium tools\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		navigatecommands();
	}
	public static void navigatecommands() throws InterruptedException
	{
		//d.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//d.navigate().to("https://www.amazon.com/");
		d.navigate().to("https://www.flipkart.com/");
		d.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id='container']/div/header/div[3]/ul/li[3]/span")).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("T-Shirts")).click();
		Thread.sleep(3000);
		d.navigate().back();
		Thread.sleep(3000);
		d.navigate().forward();
		Thread.sleep(3000);
		d.navigate().refresh();
		d.close();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		testnavigatecommand obj=new testnavigatecommand();
		obj.invokebrowser();
		
		

	}

}
