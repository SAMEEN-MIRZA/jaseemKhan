package myselenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    WebElement ele = driver.findElement(By.xpath("//span[@class=\"icp-nav-flag icp-nav-flag-in icp-nav-flag-lop\"]"));
	    boolean result = ele.isDisplayed();
	    System.out.println(result);
	   String color = ele.getCssValue("background-color");
	   System.out.println(color);
	    
	    
	}
	

}
