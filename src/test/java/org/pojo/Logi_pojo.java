package org.pojo;

import org.Base.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logi_pojo extends Base_Class {
	public Logi_pojo() {
		
		PageFactory.initElements(driver, this);	
		}

		
		
		@FindBy(name="username")
		private WebElement username;
		
		@FindBy(name="password")
		private WebElement pass;
		
		@FindBy(name="login")
		private WebElement log;

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPass() {
			return pass;
		}

		public WebElement getLog() {
			return log;
		}
		

}
