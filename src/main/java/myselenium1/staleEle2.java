package myselenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleEle2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    WebElement textArea = driver.findElement(By.xpath("//textarea[@id=\"ta1\"]"));
	    textArea.sendKeys("Sameen Mirza");
	    driver.findElement(By.linkText("compendiumdev")).click();
	    driver.navigate().back();
	    textArea = driver.findElement(By.xpath("//textarea[@id=\"ta1\"]"));  //reassigned element to overcomes stale ele ref excption
	    
	    textArea.clear();

	}

}
