package PageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import graphql.PublicApi;

public class LoginPage {

	//page factory
	@FindBy(how = How.NAME, using = "userName")
	//or
	//@FindBy(name="userName")
	public static WebElement user;
	
	@FindBy(name="password")
	public static WebElement pswd;
	
	
	@FindBy(name="submit")
	public static WebElement submit;
	
	
 /*// page object model
	public static WebElement user(WebDriver driver) {
		  
		  return driver.findElement(By.name("userName"));
		  
	  
  }
  public static WebElement pswd(WebDriver driver) {
		  
		  return driver.findElement(By.name("password"));
		  
	  
  }
+
  public static WebElement submit(WebDriver driver) {
	  
	  return driver.findElement(By.name("submit"));
	  */
	  
  
}
  

