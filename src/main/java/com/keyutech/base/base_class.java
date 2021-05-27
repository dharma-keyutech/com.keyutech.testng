package com.keyutech.base;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class {

	
	
public static WebDriver driver;

	

//Method to Lauch Browser 


		 public static void launchBrowser(String browser) throws IOException {		
			 try{	
				if (browser.equalsIgnoreCase("IE")) {
					
					WebDriverManager.iedriver().setup();
					InternetExplorerOptions options =new InternetExplorerOptions();
					driver = new InternetExplorerDriver(options);
					System.out.println("IE Browser Opened Sucessfully");
				} else if (browser.equalsIgnoreCase("Chrome")) {
			
					WebDriverManager.chromedriver().setup();
					ChromeOptions options = new ChromeOptions();
			       // options.addArguments("--headless");
			        driver = new ChromeDriver(options);
					System.out.println("Chrome Browser Opened Sucessfully");
				}
				else if(browser.equalsIgnoreCase("Firefox")){
					
					WebDriverManager.firefoxdriver().setup();
					FirefoxOptions options = new FirefoxOptions();
			        //options.addArguments("--headless");
			        driver = new FirefoxDriver(options);
					System.out.println("Firefox Browser Opened Sucessfully");
				}
			 }catch(Exception e){
				 System.out.println("Failed to launch Browser.");
			 }
			 
		
		 }
	//Method to launch application URL
		public static void sendURL(String url) {
			
			driver.navigate().to(url);
			driver.manage().window().maximize();
			System.out.println("Passing URL ");
		}
		//Method to  Close  Browser 
		public static void quitBrowser(){
			try{
				driver.close();
				//driver.quit();
				System.out.println("Browser Quit Sucessfully");
				
			}catch(Exception e){
				System.out.println("Failed to Quite Browser.");
			}
			
		}
		
		//Method to perform click operation
		public static void click(String contactus){
			
				driver.findElement(By.xpath(contactus)).click();
				System.out.println("Click Operation Performed Sucessfully");
			
		}
		
		//Method to perform sending value to a Textbox
		public static void sendValue(String locator, String testdata) {

			try {			
				driver.findElement(By.xpath(locator)).clear();
				driver.findElement(By.xpath(locator)).sendKeys(testdata);
				System.out.println("Data is Passed Sucessfully to the field");
			} catch (NoSuchElementException e) {
				System.out.println("Unable to locate and pass the data");
			System.out.println("Unable to locate and pass the data");
			}
		}
		
}