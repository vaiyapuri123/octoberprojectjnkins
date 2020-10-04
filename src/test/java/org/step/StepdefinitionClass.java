package org.step;

import java.util.List;
import java.util.Map;

import org.Base.Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.Logi_pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefinitionClass extends Base_Class {
	

	
	@Given("User is on adactin page")
	public void user_is_on_adactin_page() {
		
		loadurl("http://adactinhotelapp.com/");
		
	}
	@When("User enter the valid username and invalid password")
	public void user_enter_the_valid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {
		List<String> a = d.asList();
		Logi_pojo l=new Logi_pojo();
		fill(l.getUsername(), a.get(0));
		fill(l.getPass(), a.get(1));
		// WebElement user = driver.findElement(By.id("username"));
		// user.sendKeys(a.get(0));
		 //  WebElement pass = driver.findElement(By.id("password"));
		 //  pass.sendKeys(a.get(1));
	}

	@Then("User is click  on login invalid password")
	public void user_is_click_on_login_invalid_password() {
		Logi_pojo l=new Logi_pojo();
		btnclick(l.getLog());
		//WebElement btnLogin = driver.findElement(By.id("login"));
		//btnLogin.click();
		//driver.quit();
	}

	@When("User enter the invalid Username and  valid Password")
	public void user_enter_the_invalid_Username_and_valid_Password(io.cucumber.datatable.DataTable d) {
		List<String> a = d.asList();
		Logi_pojo l=new Logi_pojo();
		fill(l.getUsername(), a.get(0));
		fill(l.getPass(), a.get(1));
	}

	@Then("User is click  on login invalid username")
	public void user_is_click_on_login_invalid_username() {
		Logi_pojo l=new Logi_pojo();
		btnclick(l.getLog());
	}

	@When("User enter the invalid username and invalid password")
	public void user_enter_the_invalid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {
		List<String> a = d.asList();
		Logi_pojo l=new Logi_pojo();
		fill(l.getUsername(), a.get(0));
		fill(l.getPass(), a.get(1));
	}

	@Then("User is click  on login both invalid")
	public void user_is_click_on_login_both_invalid() {
		Logi_pojo l=new Logi_pojo();
		btnclick(l.getLog());
	}

	@When("User enter the  valid Username and valid Password")
	public void user_enter_the_valid_Username_and_valid_Password(io.cucumber.datatable.DataTable d) {
		List<String> a = d.asList();
		Logi_pojo l=new Logi_pojo();
		fill(l.getUsername(), a.get(0));
		fill(l.getPass(), a.get(1));
	}

	@Then("User is click  on login both valid")
	public void user_is_click_on_login_both_valid() {
		Logi_pojo l=new Logi_pojo();
		btnclick(l.getLog());
	}}


	

