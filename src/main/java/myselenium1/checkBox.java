package myselenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> checks = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for( WebElement s:checks) {
			s.click();
			
		}
		Thread.sleep(1000);
		for(int i=checks.size()-1;i>=0;i--) {
			checks.get(i).click();
			
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
