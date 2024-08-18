package myselenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksAutomation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=11464909297476676911&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299648&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> alllinks = driver.findElements(By.xpath("//a[@class=\"nav_a\"]"));
		for(WebElement s1:alllinks) {
			System.out.println("--------------------------");
			Thread.sleep(3000);
			s1.click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
			alllinks = driver.findElements(By.xpath("//a[@class=\"nav_a\"]"));
		}
	}

}
