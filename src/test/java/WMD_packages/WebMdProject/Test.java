package WMD_packages.WebMdProject;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 
//login to the app
		 
		 driver.get("https://app.exp-dev.mercuryhealthcare.com/login");
		 
		 //Wait for element
		 
		 Common_element c = new Common_element(driver);
		 
		 By logo=By.cssSelector(".mb-0.wmdi-logo.fw-bold");
		 
		 By button= By.cssSelector("#next-btn");
		 
		 By userId= By.id("1-email");
		 
		
		 
		 
		 c.Wait(logo);
		 
		 driver.findElement(By.cssSelector("#userName")).sendKeys("demo1@example.com");
		 
		 c.Wait(button);
		 
		 driver.findElement(By.cssSelector("#next-btn")).click();
		 
		 
		 c.Wait(userId);
		 
		// driver.findElement(By.id("1-email")).sendKeys("demo1@example.com");
		 driver.findElement(By.id("1-password")).sendKeys("hgDemo1");
		 driver.findElement(By.cssSelector(".auth0-label-submit")).click();
		 
		 
// Landing page
		 
		 
		 By landing_page_logo= By.cssSelector(".text-white.d-none.d-md-block");
	 //	 c.Wait(landing_page_logo);
		 
		 c.Wait_for_long(landing_page_logo);
		 
	//	 Thread.sleep(10000);
		 
		 String title=driver.findElement(By.cssSelector(".text-white.d-none.d-md-block")).getText();
		 
		 Assert.assertEquals(title, "Growth Platform");
		 
		 c.Wait(By.cssSelector("#app-header-lnk-pnr"));
		 
		 String mp =driver.findElement(By.cssSelector("#app-header-lnk-pnr")).getText();
		 Assert.assertEquals(mp, "Market Planner Insights");
		 
		 String ai =driver.findElement(By.cssSelector("#app-header-lnk-ai")).getText();
		 Assert.assertEquals(ai, "Audience Insights");
		 
		 String cwf =driver.findElement(By.cssSelector("#app-header-lnk-ca")).getText();
		 Assert.assertEquals(cwf, "Campaign Workflow");
		 
		 String cpi =driver.findElement(By.cssSelector("#app-header-lnk-sd")).getText();
		 Assert.assertEquals(cpi, "Campaign Performance Insights");
		 
		 
// Adience insight tab
		 
		 driver.findElement(By.cssSelector("#app-header-lnk-ai")).click();
		 
		 Thread.sleep(30000);
		 
	//	boolean AI_title= driver.findElement(By.cssSelector("#app-header-pgtitle-title")).isDisplayed();
		
		System.out.println(driver.findElement(By.cssSelector("#app-header-pgtitle-title")).isDisplayed());
		
		if(driver.findElement(By.cssSelector("#app-header-pgtitle-title")).isDisplayed()) {
			
		}
		else {
			driver.navigate().refresh();
			 c.Wait_for_long( By.cssSelector("#app-header-pgtitle-title"));
			
		}
		 
		 
		
		
		 
		 
		 
		 
		 
		 
// Create audience 		 
		 
		 driver.findElement(By.cssSelector("#app-header-pgtitle-option-btn-label-0")).click();
		 
		 Thread.sleep(3000);
		 
		String window_name= driver.findElement(By.cssSelector("#ta-save-mdl-title")).getText();
		
		
		Assert.assertEquals(window_name, "Create Audience");
		
		
		Date d = new Date(System.currentTimeMillis());
		driver.findElement(By.cssSelector("#ta-save-mdl-form-population-name")).sendKeys("qa_test"+d);
		
		driver.findElement(By.cssSelector("#ta-save-mdl-form-population-desc")).sendKeys("test");
		
		driver.findElement(By.cssSelector(".btn.btn-primary.ml-2")).click();
		
		 
		 
	

		// search audience list
		 
		
	//	c.Wait_for_long(landing_page_logo);
		
		By audience_list_ui=By.cssSelector("#app-header-pgtitle-title");
		
		c.Wait_for_long(audience_list_ui);
		
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector(".img-fluid.back-arrow")).click();
		
		 driver.findElement(By.cssSelector("#ta-ip-sb")).sendKeys("qa_test");
		 driver.findElement(By.cssSelector("#ta-ip-sb")).sendKeys(Keys.ENTER);
		 
		 
// Delete audience created by automation test
		 
		 
		By SS= By.cssSelector(".hover-row.ng-scope");
		
		c.Wait_for_long(SS);
		 
	//	List<WebElement> ai_list= driver.findElements(By.cssSelector(".hover-row.ng-scope"));
		
		
		
		
		
		
		boolean bool=driver.findElement(By.cssSelector(".hover-row.ng-scope")).isDisplayed();
		System.out.println(bool);
		
		 do {
			

			Actions a = new Actions(driver);
			
			WebElement wb=	driver.findElement(By.cssSelector(".pl-0.pr-0.border-top-0"));
			
			
		 
			
			a.moveToElement(wb).build().perform();
			
		
			c.Wait(By.cssSelector("#ta-ic-more-info"));
			
			driver.findElement(By.cssSelector("#ta-ic-more-info")).click();
			driver.findElement(By.cssSelector("#ta-delete-aud")).click();
			c.Wait(By.cssSelector("#popover-delete-audience"));
			//Thread.sleep(4000);
			driver.findElement(By.cssSelector("#popover-delete-audience")).click();
			
			Thread.sleep(5000);
			
			
		}
		 while(bool);
		

		/*
		  
		
		
		for(int i=0;i<ai_list.size();i++) {
			
			
			Actions a = new Actions(driver);
			
			WebElement wb=	driver.findElement(By.cssSelector(".pl-0.pr-0.border-top-0"));
			
			
		 
			
			a.moveToElement(wb).build().perform();
			
		
			c.Wait(By.cssSelector("#ta-ic-more-info"));
			
			driver.findElement(By.cssSelector("#ta-ic-more-info")).click();
			driver.findElement(By.cssSelector("#ta-delete-aud")).click();
			c.Wait(By.cssSelector("#popover-delete-audience"));
			driver.findElement(By.cssSelector("#popover-delete-audience")).click();
			
			Thread.sleep(5000);
			
		}
		 
		 
	 */	
		
		
	}

}
