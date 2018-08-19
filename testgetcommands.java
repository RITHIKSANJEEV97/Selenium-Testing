package Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testgetcommands {

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
		getcommands();
	}
	public static void getcommands()
	{
		try{
		String s="";
		d.get("https://www.amazon.com/");
		//d.getPageSource();
		s=d.getTitle();
		System.out.println("pagetitles  :"+s);
		d.findElement(By.linkText("Today's Deals")).click();
		String curl=d.getCurrentUrl();
		System.out.println("current url :"+curl);
		//System.out.print("page sourse"+d.getPageSource());
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testgetcommands obj=new testgetcommands();
		obj.invokebrowser();

	}

}
