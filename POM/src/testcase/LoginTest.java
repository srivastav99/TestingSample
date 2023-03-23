package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjectClass.LoginPage;

public class LoginTest {
  @Test
  public void f() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium drivers,jars\\chromedriver110\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options); 
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//page factory
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.user.sendKeys("selenium");
		LoginPage.pswd.sendKeys("ewcewfew");
		LoginPage.submit.click();
		
		
		/*//page object model
		LoginPage.user(driver).sendKeys("selenium");
		LoginPage.pswd(driver).sendKeys("defergregd");
		LoginPage.submit(driver).click(); 
		*/
		
		/*//normal way
		driver.findElement(By.name("userName")).sendKeys();
		driver.findElement(By.name("password")).sendKeys();
		driver.findElement(By.name("submit")).click();
		*/
		
  }
}
