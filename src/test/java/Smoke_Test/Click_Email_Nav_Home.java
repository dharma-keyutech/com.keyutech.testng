package Smoke_Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.keyutech.base.base_class;



public class Click_Email_Nav_Home extends base_class implements com.keyutech.base.all_xpaths {
	
	
	public static String BrowserName=System.getProperty("Browsername");

	static WebDriver driver;
	@Test(groups={"Smoke"})
    public static void Contactus() throws IOException{
		
		// To read The Property File 
				Properties prop=new Properties();
				FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/data.properties");
				prop.load(ip);
		
				// Launching Browser
		
	     launchBrowser(BrowserName);	
	     
	     // passing the URL
	     
		 sendURL(prop.getProperty("BaseUrl"));
		
		 // Performing Click on element
        click(Contactus);
        System.out.println("Click on ContactUs Sucessfully");
        
        // Performing Click on element
        
            click(Home); 
         System.out.println("Navigating to Home ");
      
    	
         // Closing the browser 
         
         quitBrowser();
		 
		
	}
	
	
	

}