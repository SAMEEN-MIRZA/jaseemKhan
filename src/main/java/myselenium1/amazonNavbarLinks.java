package myselenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonNavbarLinks {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    List<WebElement> links = driver.findElements(By.xpath("//*[@id=\"nav-xshop\"]/a"));
	    for(int i=0; i<links.size();i++) {
	    	links.get(i).click();
	    	Thread.sleep(1000);
	    	System.out.println(driver.getTitle());
	    	driver.navigate().back();
	    	links = driver.findElements(By.xpath("//*[@id=\"nav-xshop\"]/a"));  //reassigned ele/locator
	    }
	}

}
