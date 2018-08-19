import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class checkf {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\selenium tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.getTitle();
		driver.navigate().to("https://www.edureka.co/testing-with-selenium-webdriver");
		 
		driver.navigate().back();
		driver.navigate().refresh();
		driver.wait(5000);
		// or use
		Thread.sleep(5000);
		 
		//driver.findElement(By.name("email")).sendKeys("sajirocks1@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("xxxxxx");
		//driver.findElement(By.id("u_0_q")).click();
		 
		driver.quit();
	}

}
