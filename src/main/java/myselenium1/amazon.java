package myselenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Samsung s24 ultra 5G");
	    driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	    Thread.sleep(2000);
//	    String ratings = driver.findElement(By.xpath("((//div[@class=\"a-section a-spacing-none a-spacing-top-micro\"])[32]//span)[1]")).getText();    
//	     System.out.println(ratings);
	   driver.get("https://www.amazon.in/Samsung-Galaxy-Smartphone-Titanium-Storage/dp/B0CQYGF1QY/ref=sr_1_1_sspa?dib=eyJ2IjoiMSJ9.91n9dFdC2fEXiQRycBfgUb8bjzWmJH1hpb_lIwX96hLjHGuUqfz8mZKr5tbhC_Dwp-ErkVTl4vYMXU7LZ3UdeNgUQNsPHi2Eq0h-8H1tmym43q5gunnZeUUjCcH2GsSsB9thd65F_AQndX3e3Si7IPpb1nZ7KZzOvL4lTqxlsn7IrKmGnQp8fXxL15wxRY0bV7o0BGjU_hPXPFkEEqFQo8y-ehLt_5YSY1Xg8aQS72s.GZCQyFHWLOLfkeUXB6np4k-3Q6zj9kmKkX461bj39dU&dib_tag=se&keywords=Samsung+s24+ultra+5G&qid=1712311598&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
	   driver.findElement(By.xpath("(//input[@id=\"add-to-cart-button\"])[2]")).click();
	
	}
}
