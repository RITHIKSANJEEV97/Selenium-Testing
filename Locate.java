package locatebrowserelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate {

	/**
	 * @param args
	 */
	static WebDriver d;
	static JavascriptExecutor js;
	public static void invokebrowser(String url)
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\selenium tools\\chromedriver_win32\\chromedriver.exe");
        d=new ChromeDriver();
        d.manage().window().maximize();
        d.manage().deleteAllCookies();
        d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        d.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        d.get(url);
	}
	public static void Locateamazon()
	{
		invokebrowser("https://www.amazon.in/");
		//d.findElement(By.id("twotabsearchtextbox")).sendKeys("puma shoes");
		d.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("laptop");
		d.findElement(By.className("nav-input")).click();
		d.navigate().back();
		d.findElement(By.partialLinkText("Customer")).click();
		d.navigate().back();
		d.findElement(By.linkText("Today's Deals")).click();
		d.navigate().back();
		d.quit();
		//Locatefb();
	}
	public static void Locatefb() throws InterruptedException
	{
		invokebrowser("https://www.facebook.com");
		d.findElement(By.name("firstname")).sendKeys("rithik");
		d.findElement(By.name("lastname")).sendKeys("rithik");
		d.findElement(By.name("reg_email__")).sendKeys("rithiksanjeev1@gmail.com");
		d.findElement(By.name("reg_email_confirmation__")).sendKeys("");
		d.findElement(By.name("reg_passwd__")).sendKeys("");
		Thread.sleep(3000);
		d.findElement(By.id("day")).sendKeys("2");
		d.findElement(By.name("birthday_month")).sendKeys("Nov");
		d.findElement(By.name("birthday_year")).sendKeys("1997");
		d.findElement(By.id("u_0_a")).click();
		//d.findElement(By.id("u_0_11")).click();
		
	}
	public static void logfb() throws InterruptedException
	{
		invokebrowser("https://www.facebook.com");
		d.findElement(By.name("email")).sendKeys("");
		d.findElement(By.name("pass")).sendKeys("");
		d.findElement(By.id("loginbutton")).click();
		Thread.sleep(10000);
		//js=(JavascriptExecutor)d;
		//js.executeScript("scroll(0,1000)");
		d.findElement(By.id("userNavigationLabel")).click();
		//d.findElement(By.xpath("//*[@id='js_2w']/div/div/ul/li[15]")).click();
		d.findElement(By.xpath("//*[@id='navItem_100002295380857']/a")).click();
		d.findElement(By.xpath("//*[@id='u_fetchstream_2_9']/li[4]/a")).click();
		
		
	}
	public static void flipkart()
	{
		invokebrowser("https://www.flipkart.com");
		d.findElement(By.cssSelector("input.LM6RPg")).sendKeys("pillow");
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Locate o=new Locate();
		Locateamazon();
		//Locatefb();
		//logfb();
		//flipkart();

	}

}
