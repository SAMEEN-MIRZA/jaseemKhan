package myselenium1;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6prize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone12");
	    driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	    Thread.sleep(2000);
	    List<WebElement> allprizes = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
//	    for(int i=0; i<allprizes.size();i++) {
//	    	String text = allprizes.get(i).getText();
//	    	System.out.println(text);
//	    }
	    for(WebElement s1:allprizes) {
	    	System.out.println(s1.getText());
	    }
	    System.out.println("-----------------");
	    TreeSet<String> tr=new TreeSet<String>();
	   
	    for(WebElement s2:allprizes) {
	    	String text2 = s2.getText();
	    	tr.add(text2);
	    	System.out.println(text2);
	    }
       
	  
	}

}
