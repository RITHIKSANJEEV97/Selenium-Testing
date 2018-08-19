import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class edureka {

	/**
	 * @param args
	 */
	WebDriver d;
	JavascriptExecutor js;
	public void invokebrowser() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","E:\\selenium\\selenium tools\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\selenium tools\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.get("https://www.edureka.co/");
		searchbrowser();
	}
	public void searchbrowser() throws InterruptedException
	{
	d.findElement(By.id("homeSearchBar")).sendKeys("java");
	Thread.sleep(3000);
	d.findElement(By.id("homeSearchBarIcon")).click();
	js=(JavascriptExecutor)d;
	js.executeScript("scroll(0,1000)");
	
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		edureka obj=new edureka();
		obj.invokebrowser();

	}

}
