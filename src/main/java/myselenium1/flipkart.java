package myselenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	    List<WebElement> links = driver.findElements(By.xpath("(//div[@class=\"css-175oi2r r-13awgt0 r-eqz5dr\"])[1]//div[@class=\"_2GaeWJ\"]"));
	    List<WebElement> links = driver.findElements(By.xpath("//div[@class=\"_3sdu8W emupdz\"]//div[@class=\"_2GaeWJ\"]"));
	    for(int i=0; i<links.size();i++) {
	    	links.get(i).click();
	    	Thread.sleep(3000);
            driver.navigate().back();
	    	Thread.sleep(3000);

//		    links = driver.findElements(By.xpath("(//div[@class=\"css-175oi2r r-13awgt0 r-eqz5dr\"])[1]//img"));
		    links = driver.findElements(By.xpath("//div[@class=\"_3sdu8W emupdz\"]//div[@class=\"_2GaeWJ\"]"));


	    }
	}

}
