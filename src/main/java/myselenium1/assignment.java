package myselenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://uat-uim-samhita.pacewisdom.in/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
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
	    Thread.sleep(30000);
	    //home page form
	    driver.findElement(By.xpath("//mat-panel-title[text()=' IP Management ']")).click(); //click on IP Management
	    driver.findElement(By.xpath("//a[text()='List of IP']")).click();                   //click on List of IP
	    driver.findElement(By.xpath("//a//span[text()='Add Agent']")).click();              //click on Add Agent
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@formcontrolname='first_name']")).sendKeys("Jaseem"); //Enter first name
	    driver.findElement(By.xpath("//input[@formcontrolname='last_name']")).sendKeys("Khan");    //Enter last name
	    driver.findElement(By.xpath("//input[@formcontrolname='phone']")).sendKeys("2554397861");  //Enter mobile no
	    driver.findElement(By.xpath("(//button[@aria-label='Open calendar'])[1]")).click();       //click on calender
//	    while(true) {            //for calender handling
//		    String dob = driver.findElement(By.xpath("//span[text()=\"WED OCT 14 1992\"]")).getText();
//		    if(dob.equals("WED OCT 14 1992")) {
//		    	List<WebElement> daylist = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td"));
//		    	for( WebElement e:daylist) {
//		    		String calDate = e.getText();
//		    		if(calDate.equals(14)) {
//		    			e.click();
//		    			break;
//		    		}
//		    	}
//		    	
//		    }
//
//	    }
	    
	    

	    
	    driver.findElement(By.xpath("//div[text()=' 3 ']")).click();                              //select any date
	    driver.findElement(By.xpath("//mat-label[text()='Gender']")).click();                  //click on gender
	    driver.findElement(By.xpath("//span[text()='Male']")).click();                        //click on male
	    driver.findElement(By.xpath("//mat-label[text()='Marital Status']")).click();        //click on marital status
	    driver.findElement(By.xpath("//span[text()=\"Single\"]")).click();                   //click on single
	    driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("jaseemkhan@gmail.com"); //enter email
	    driver.findElement(By.xpath("//mat-label[text()='Select Implementation Partner']")).click();     //click on Select Implementation Partner
	    driver.findElement(By.xpath("(//span[text()=\"Test IP sameen\"])[2]")).click();        //click on Test IP sameen 
	    driver.findElement(By.xpath("(//span[text()=' Continue '])[1]")).click();         //click on continue
	    
	    driver.findElement(By.xpath("//input[@id=\"mat-input-31\"]")).sendKeys("Barabhai Mohalla");
	    driver.findElement(By.xpath("//input[@id=\"mat-input-33\"]")).sendKeys("445202");
	    driver.findElement(By.xpath("//input[@id=\"mat-input-36\"]")).sendKeys("darwha");
	    driver.findElement(By.xpath("//span[text()=\"Darwha\"]")).click();
	    driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
	    driver.findElement(By.xpath("//input[@id=\"mat-input-38\"]")).sendKeys("CMBPM8554Q");
	    driver.findElement(By.xpath("//input[@id=\"mat-input-39\"]")).sendKeys("Jaseem Khan");
	    driver.findElement(By.xpath("//input[@id=\"mat-input-40\"]")).sendKeys("Junaid Khan");
	    driver.findElement(By.xpath("(//button[@aria-label=\"Open calendar\"])[2]")).click(); //click on calendar
	    driver.findElement(By.xpath("//input[@id=\"mat-input-45\"]")).sendKeys("barabhai mohalla");
	    driver.findElement(By.xpath("//input[@id=\"mat-input-46\"]")).sendKeys("yavatmal");
	    driver.findElement(By.xpath("//input[@id=\"mat-input-47\"]")).sendKeys("Maharashtra");
	    driver.findElement(By.xpath("//input[@id=\"mat-input-48\"]")).sendKeys("445202");
        driver.findElement(By.xpath("(//button[@type=\"submit\"])[4]")).click();


	    

	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
//	   ((JavascriptExecutor)driver).executeScript("window.open()");
//	    driver.navigate().to("https://yopmail.com/wm");
	    
	    
//	    Thread.sleep(3000);
//	    driver.get("https://yopmail.com/");
//	    driver.findElement(By.xpath("//input[@id=\"login\"]")).sendKeys("testsameenip6678@yopmail.com");
//	    driver.findElement(By.xpath("//button[@class=\"md\"]")).click();
//	    String otp = driver.findElement(By.xpath(" //div[@id=\"mail\"]//p[starts-with(text(),'your one')]")).getText();
//	    driver.navigate().back();
//	    driver.findElement(By.xpath("//span[@class=\"mat-content ng-tns-c263-13\"]")).click();
//	    driver.findElement(By.xpath("//div[@id=\"cdk-accordion-child-2\"]")).click();
//	    driver.findElement(By.xpath("//img[@class=\"add_role image-color\"]")).click();
	    

	    
	}

}
