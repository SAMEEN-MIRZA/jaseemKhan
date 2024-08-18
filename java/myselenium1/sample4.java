package myselenium1;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"placeholder\"]//following-sibling::input[1]")).sendKeys("Sameen");
//		driver.findElement(By.xpath("//input[@id=\"u_3_d_Ng\"]")).sendKeys("Mirza");
//		driver.findElement(By.xpath("//button[@id=\"u_3_s_PY\"]")).click();
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select s1=new Select(day);
		s1.selectByValue("4");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class=\"_58mt\"])[2]")).click();
		
		
		

		
	}

}
