import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Try {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\CG-DTE\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?.intl=us&specId=yidReg&done=https%3A%2F%2Fwww.yahoo.com");
		driver.findElement(By.cssSelector("[href*='terms']")).click();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> iterate=handles.iterator();
		String home=iterate.next();
		String terms=iterate.next();
		driver.switchTo().window(terms);
		String termsTitle=driver.getTitle();
		System.out.println(terms);
		//Assert.assertEquals(termsTitle, );
		
		
	}

}
