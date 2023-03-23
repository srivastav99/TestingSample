package PageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class RegisterPage {
 
	//page factory
	@FindBy(how = How.XPATH, using = "//input[@name='firstName']")
	public static WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastName']")
	public static WebElement lastName;
	
	@FindBy(css = "input[name='phone']")
	public static WebElement phone;
	
	@FindBy(how = How.CSS, using = "input[name='userName")
	public static WebElement eMail;
  /*page object model
	public static WebElement firstName(WebDriver driver) {
	  
	  return driver.findElement(By.xpath("//input[@name='firstName']"));
	  
  }
  public static WebElement lastName(WebDriver driver) {
	  
	  return driver.findElement(By.xpath("//input[@name='lastName']"));
	  
  }
  
  public static WebElement phone(WebDriver driver) {
	  
	  return driver.findElement(By.cssSelector("input[name='phone']"));
	  
  }
  
  public static WebElement eMail(WebDriver driver) {
	  
	  return driver.findElement(By.cssSelector("input[name='userName']"));
	  
	  
  }
  */
  
  
  
}
