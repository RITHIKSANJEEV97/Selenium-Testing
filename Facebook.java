package Sikuli;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Facebook {

	/**
	 * @param args
	 */
	static WebDriver d;
	static Screen myscreen;
	public static void invokebrowser(String url)
	{
		try
		{
		System.setProperty("webdriver.gecko.driver","E:\\selenium\\selenium tools\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		d.get(url);
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void signinfb()
	{
		invokebrowser("https://www.facebook.com");
		Pattern userid=new Pattern("E:\\selenium\\sikuli\\snipped images\\fbemail.PNG");
		Pattern pass=new Pattern("E:\\selenium\\sikuli\\snipped images\\fbpassword.PNG");
		Pattern login=new Pattern("E:\\selenium\\sikuli\\snipped images\\fblogin.PNG");
		
		try {
			myscreen =new Screen();
			myscreen.wait(userid,3);
			myscreen.type(userid,"");
			myscreen.type(pass,"");
			myscreen.click(login);
			
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook d=new Facebook();
		signinfb();
	}

}
