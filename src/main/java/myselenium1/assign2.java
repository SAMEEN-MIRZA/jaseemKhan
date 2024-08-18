package myselenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://uat-uim-samhita.pacewisdom.in/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id=\"mat-input-0\"]")).sendKeys("testsameenip6678@yopmail.com");
	    driver.findElement(By.xpath("//input[@id=\"mat-input-1\"]")).sendKeys("Test@123");
	    Thread.sleep(3000);
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title=\"reCAPTCHA\"]")));
	    driver.findElement(By.xpath("//div[@class=\"recaptcha-checkbox-border\"]")).click();
	    Thread.sleep(3000);
        driver.switchTo().defaultContent();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//button[contains(@class, 'mat-focus-indicator')]/span")).click(); //sign in button
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://yopmail.com/");
	    

	}

}
