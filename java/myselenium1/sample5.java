package myselenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sample5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	    List<WebElement> footerlinks = driver.findElements(By.xpath("/html/body/div[7]/a"));
	    for(int i=0; i<footerlinks.size();i++) {
	    	footerlinks.get(i).click();
	    	System.out.println("The title of this page: "+driver.getTitle());
	    	driver.navigate().back();
	    	footerlinks = driver.findElements(By.xpath("/html/body/div[7]/a"));
	    	

	    	  
	    	
	    }

	}

}
