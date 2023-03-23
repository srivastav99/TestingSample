package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjectClass.RegisterPage;
import graphql.PublicApi;

public class RegisterTest {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		//page factory
		PageFactory.initElements(driver, RegisterPage.class);
		RegisterPage.firstName.sendKeys("java");
		RegisterPage.lastName.sendKeys("selenium");
		RegisterPage.phone.sendKeys("23874324");
		RegisterPage.eMail.sendKeys("selenium@gmail.com");
		
		//page object model
		/*
		RegisterPage.firstName(driver).sendKeys("java");
		RegisterPage.lastName(driver).sendKeys("selenium");
		RegisterPage.phone(driver).sendKeys("24233543");
		RegisterPage.eMail(driver).sendKeys("selenium@gmail.com");
		*/
  }
}
