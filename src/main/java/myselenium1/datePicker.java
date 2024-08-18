package myselenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		
		while(true) {
			String month = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String year = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			
			
			if(year.equals("2000")&& month.equals("October")) {
				driver.findElement(By.xpath("//a[@data-date=\"14\"]")).click();
				break;
			}
			else {
				driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
			}

		}
	}

}
