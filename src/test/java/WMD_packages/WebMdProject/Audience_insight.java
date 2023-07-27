package WMD_packages.WebMdProject;

import java.io.IOException;

import org.testng.annotations.Test;

public class Audience_insight extends Main {
	
	@Test
	public void newq() throws IOException, InterruptedException{
		
		Landing_page lc=	initialize();
		lc.login();
		
	}
	
	

}
