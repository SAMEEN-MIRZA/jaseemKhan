package myselenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tutorialCurrancyHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement curr = driver.findElement(By.xpath("(//div[@class=\"btn-group\"])[1]"));
        Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.click(curr).perform();
		WebElement cu = driver.findElement(By.xpath("//button[@name=\"GBP\"]"));
		act.click(cu).perform();
	
		
	

	}

}
