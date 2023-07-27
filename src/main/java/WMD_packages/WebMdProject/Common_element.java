package WMD_packages.WebMdProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common_element {
	WebDriver driver;
	
public	Common_element(WebDriver driver) {
	
    this.driver=driver;
	
	
}
	

public void logo() {
	
	String wb=driver.findElement(By.cssSelector(".mb-0.wmdi-logo.fw-bold")).getText();
	
	System.out.println(wb);
}


public void Wait(By findby) {
	
	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
	w.until(ExpectedConditions.visibilityOfElementLocated(findby));
}


public void Wait_for_long(By findby) {
	
	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(120));
	w.until(ExpectedConditions.visibilityOfElementLocated(findby));
}


}
