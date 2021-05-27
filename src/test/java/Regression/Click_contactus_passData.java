package Regression;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
/*import org.testng.Assert;
*/import org.testng.annotations.Test;

import com.keyutech.base.base_class;



public class Click_contactus_passData extends base_class implements com.keyutech.base.all_xpaths{
	// Logs to display in Consoul at Reportportal
	
	public static String BrowserName=System.getProperty("Browsername");
	@Test(groups={"Regression"})
	public static void EmailUs() throws IOException, InterruptedException{
	
	// To read The Property File 
			Properties prop=new Properties();
			FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/data.properties");
			prop.load(ip);
		// Send a mail From Contactus
			
	    try {
	    	
	    	// launching Browser
	    	
		    launchBrowser(prop.getProperty("Browser"));
			
			Thread.sleep(5000);

			// PAssing Url 
			
			sendURL(prop.getProperty("BaseUrl"));
			 
			Thread.sleep(5000);
			// Performing Click  Operation on Element
			Thread.sleep(5000);

			click(Contactus);
			 System.out.println("Clicking");
			
			// Passing the Values To required Fields 
			
			   sendValue(Name, prop.getProperty("yourname"));
			    System.out.println("Sending User Name");
			   
			   sendValue(Phone, prop.getProperty("phoneno"));
			     System.out.println("Sending User Phno");
			   
			    sendValue(Email,prop.getProperty("emailid"));
			      System.out.println("Sending User Mail ID");
			    
			     sendValue(Message, prop.getProperty("messagetext"));
			       System.out.println("Passing user message ");
			      Thread.sleep(5000);
			
			   // Performing Click  Operation on Element 
			      click(SendMessageBtn);  
			       System.out.println("Clicked on submit Sucessfully");
			  
			      
		} catch (Exception e) {
			

				   /* logger.error("Test Fail", e);*/
				    //onTestFailure();
				    driver.quit();
				   AssertJUnit.fail("");
					
				}

		   quitBrowser();
		       
	}
		
		      
		       
		      
		     
	
	}