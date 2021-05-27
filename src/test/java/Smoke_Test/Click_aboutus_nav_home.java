package Smoke_Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.keyutech.base.base_class;

public class Click_aboutus_nav_home extends base_class implements com.keyutech.base.all_xpaths{
	
	public static String BrowserName=System.getProperty("Browsername");
	@Test(groups={"Smoke"})
	
	public static void aboutus() throws IOException, InterruptedException{
		
		// To read The Property File 
				Properties prop=new Properties();
				/*FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\data.properties");*/
				FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/data.properties");
				prop.load(ip);
		
        // Launching Browser
				
		launchBrowser(BrowserName);	 
		
		// Passing URL
		
		sendURL(prop.getProperty("BaseUrl"));
	 
     // Performing click on Element
		
      click(Aboutus);
     System.out.println("Click on ABoutUs Sucessfully"); 
           Thread.sleep(3000);
           
           driver.navigate().back();
           System.out.println("Navigating Back");
    
           // closing the browser
    
           
      quitBrowser();
      
	}


}