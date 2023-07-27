package WMD_packages.WebMdProject;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.Random;
public class Test_practise {
	
	
	@Test
	
	 
    public static String getRandomNumber() {
        Random random = new Random();
        long n = (long) (100000L + random.nextFloat() * 900000L);
        return new Long(n).toString();
    }/*from   www.  j a  va 2  s. c  om*/
 

	
	
	@Test
	
	public void ts() {
		
		
	     
		Date d = new Date(System.currentTimeMillis());
	//	driver.findElement(By.id("txtUserName")).sendKeys("classroomuser" + d);
		
		System.out.println(d);
	}

	
 
	
	
	
	
}
