import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class amazon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\selenium tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
	    d.get("https://www.amazon.in/");
	    d.manage().window().maximize();
	  //  d.findElement(By.className("nav-search-label")).click();
	    d.findElement(By.id("twotabsearchtextbox")).sendKeys("apple");
	    d.findElement(By.className("nav-input")).click();
	    d.findElement(By.className("a-size-medium s-inline  s-access-title  a-text-normal")).click();
	    d.close();

	}

}
