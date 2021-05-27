package com.keyutech.Full_suite;

	import org.testng.annotations.Test;
import org.testng.AssertJUnit;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import com.keyutech.base.base_class;


	import Regression.Click_contactus_passData;
	import Smoke_Test.home_page_with_all_links;

	public class Keyutech extends base_class implements com.keyutech.base.all_xpaths{
		
	    
			@Test
			public static void keyutechSite() throws IOException, InterruptedException {
			
			// To read The Property File 
					Properties prop=new Properties();
					FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/data.properties");
					prop.load(ip);
					  try {		
					//  Launching Browser 
					
					launchBrowser(prop.getProperty("Browser"));
					
					// Passing the URL
					
				    sendURL(prop.getProperty("BaseUrl"));
				    
					// Performing CLick On All visible Links	 

			         click(Aboutus);
			         System.out.println(" clicked on  About us");
			         click(Services);
			         System.out.println("clicked on Services");
			         click(Products);
			         System.out.println("clicked on Products");
			         click(TCoE);
			         System.out.println("clicked on TCoE");
			         click(Contactus); 
			         System.out.println("clicked on Contact us");
			         click(Home);
			         System.out.println("Clicking on Home and navigating to home");
			         Thread.sleep(5000);
			         
			         System.out.println();
			      // Closing the browser
			         
			       quitBrowser();
			         
			       //Performing Click on  all links on Home Page 
			              Click_contactus_passData.EmailUs();
			              
			      // Gathering all links and clicking on all links
			              home_page_with_all_links.CLickLinks();
					  }
			              
			              catch (Exception e) {
			      			

							   /* logger.error("Test Fail", e);*/
							    //onTestFailure();
							    driver.quit();
							   AssertJUnit.fail("");
								
							}

			              
			              
			           
		
			}
	}


