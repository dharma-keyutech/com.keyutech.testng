package Smoke_Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.keyutech.base.base_class;


public class home_page_with_all_links  extends base_class implements com.keyutech.base.all_xpaths{

	public static String BrowserName=System.getProperty("Browsername");


	@Test(groups={"Smoke"})
	public static void CLickLinks() throws IOException, InterruptedException{
	
	// To read The Property File 
		Properties prop=new Properties();
		/*FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\data.properties");*/
		FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/data.properties");
		prop.load(ip);
	
      launchBrowser(BrowserName);	 
	   sendURL(prop.getProperty("BaseUrl"));
   

	//Get list of web-elements with tagName  - a
	 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	  
	 // printingtext along with link address
	 for(WebElement link:allLinks){
	 System.out.println(link.getText() + " - " + link.getAttribute("href"));
	 }
	  
	 
	 for(int i=0;i<allLinks.size();i++)
     {
         if((allLinks.get(i).isDisplayed()))
         {
        	 
        	 allLinks.get(i).click();
        
        	 System.out.println("Click Operation Performend on Links" );
         Thread.sleep(3000);
    
       
         driver.navigate().back();
        
         allLinks=driver.findElements(By.tagName("a"));
         }  
     
     
	}  
	 quitBrowser();
  }
}