package org.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	public static WebDriver driver;
	//C:\Users\home\Desktop
	
	public static void loadpage()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver.exe" );
		
	driver=new ChromeDriver();	
		
	}
		
    public static void loadurl(String url) 
    {
			
	driver.get(url);
	
    }
    public static void fill(WebElement e,String s) 
    {
    	e.sendKeys(s);
    	
    	
    }
    public static void btnclick(WebElement ee) {
    	
    	ee.click();
		
	}
    
    
    public static void quite() {
    	driver.quit();
		
	}
    

}
