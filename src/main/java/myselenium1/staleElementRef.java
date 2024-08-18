package myselenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleElementRef {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
        List<WebElement> footerlinks = driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/a"));
       for(int i=0;i<footerlinks.size();i++) {
    	   System.out.println(footerlinks.get(i).getText());
    	   System.out.println(footerlinks.get(i).getAttribute("href"));
    	   System.out.println("------------------------------");
    	   Thread.sleep(2000);
    	   footerlinks.get(i).click();
    	   System.out.println("The title of this page: "+driver.getTitle());
    	   driver.navigate().back();
    	   footerlinks = driver.findElements(By.xpath("/html/body/div[7]/a"));  //reassigned element locator
    	   
       }
	}

}
