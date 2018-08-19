import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gmail {

	/**
	 * @param args
	 * @return 
	 * @throws InterruptedException 
	 */

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\selenium tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
	    d.get("http://www.gmail.com/");
	    d.manage().window().maximize();
	   d.findElement(By.id("identifierId")).sendKeys("rithiksanjeev1");
	   Thread.sleep(2000);
	    d.findElement(By.className("CwaK9")).click();
	    Thread.sleep(2000);
	 //   d.findElement(By.id("whsond.zHQkBf")).sendKeys("rithiksanjeev1");
		// Thread.sleep(2000);
		    d.findElement(By.className("CwaK9")).click();
		    Thread.sleep(2000);
	    String at=d.getTitle();
	    String et="gmail";
	    if(at.equalsIgnoreCase(et))
	    {
	    	System.out.println("succes");
	    }
	    else
	    {
	    	System.out.println("try agin");
	    }
	    d.close();
		}
		catch(Exception e)
		{
			
		}

	}

}
