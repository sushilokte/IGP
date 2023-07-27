package WMD_packages.WebMdProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Landing_page extends Common_element {
	
	WebDriver driver;
	public Landing_page(WebDriver driver) {
		super(driver);
	 
		this.driver=driver;
		
	}
	
	
 
	
	
	
	public void login() throws IOException, InterruptedException {
		
	 //initialize();
		
		
		 
		driver.get("https://app.exp-dev.mercuryhealthcare.com/login");
		
		Thread.sleep(3000);
		logo();
		
		
	}
	

}
