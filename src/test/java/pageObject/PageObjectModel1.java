package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageObjectModel1 {
	
	//method 01
	
	@FindBy(how=How.ID, using="userName")
	public static WebElement username;
	
	@FindBy(id="userEmail")
	public static WebElement email;
	
	@FindBy(id="currentAddress")
	public static WebElement currentAddress;
	
	@FindBy(id="permanentAddress")
	public static WebElement PermanentAddress;
	
	@FindBy(id="submit")
	public static WebElement submitbutton;

	
	// method 02
	
	public static WebElement username(WebDriver driver) {
		
		return driver.findElement(By.id("userName"));
		
	}
	
	public static WebElement email(WebDriver driver) {
		
		return driver.findElement(By.id("userEmail"));
		
	}
	
	public static WebElement currentAddress(WebDriver driver) {
		
		return driver.findElement(By.id("currentAddress"));
		
	}
	
	public static WebElement PermanentAddress(WebDriver driver) {
		
		return driver.findElement(By.id("permanentAddress"));
	}
	
	public static WebElement submitbutton(WebDriver driver) {
		
		return driver.findElement(By.id("submit"));
		
	}

}
