package WMD_packages.WebMdProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {
	
	WebDriver driver;
	

	
	
	
	public Landing_page initialize() throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\WebMdProject\\src\\main\\java\\GlobalData.properties");
		
		
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		
		 
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			 
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			
			WebDriverManager.firefoxdriver().setup();
			  driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			 
			
		
			
		}
		//return driver;
		Landing_page lp = new Landing_page(driver);
		return lp;
		
	 
		
	//	Landing_page lp = new Landing_page(driver);
	//	return lp;
		
	}
	
	  

}
