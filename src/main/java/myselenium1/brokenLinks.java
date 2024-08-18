package myselenium1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) throws  IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for(WebElement link:allLinks) {
			String url = link.getAttribute("href");
			System.out.println(url+" is valid");
			if(url==null || url.isEmpty()) {
				System.out.println("URL is empty");
				continue;
			}
       
		    HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
			
			
		}

	}

}
