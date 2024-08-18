package myselenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("sameen");
	    WebElement lastName = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
	     ((JavascriptExecutor)driver).executeScript("arguments[0].value='mirza'",lastName);
	    driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9175131267");
	    driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("Sam@123");
	    WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
	    WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
	    WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
        Select s1=new Select(day);
        Select s2=new Select(year);
        Select s3=new Select(month);
        s1.selectByValue("14");
        s2.selectByValue("1992");
        s3.selectByValue("10");
        driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).click();
        driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();


	    

	    
	    
	}

}
