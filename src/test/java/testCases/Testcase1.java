package testCases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.PageObjectModel1;

public class Testcase1{
	
	
	@Test
	public void ToolsQATextBox() {
		
		// Launch Browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		
		
		// method 01
		
		PageFactory.initElements(driver, PageObjectModel1.class);
		
		PageObjectModel1.username.sendKeys("RADHAKRISHNAN A");
		PageObjectModel1.email.sendKeys("radhakrishnanof1995@gmail.com");
		PageObjectModel1.currentAddress.sendKeys("M PANDIANKOTTAI, THIRUPPUVANAM, SIVAGANGA- 630611");
		PageObjectModel1.PermanentAddress.sendKeys("M PANDIANKOTTAI, THIRUPPUVANAM, SIVAGANGA- 630611");
		PageObjectModel1.submitbutton.click();
		
		
		// method 02
		
		PageObjectModel1.username(driver).sendKeys("RADHAKRISHNAN A");
		PageObjectModel1.email(driver).sendKeys("radhakrishnanof1995@gmail.com");
		PageObjectModel1.currentAddress(driver).sendKeys("M PANDIANKOTTAI, THIRUPPUVANAM, SIVAGANGA- 630611");
		PageObjectModel1.PermanentAddress(driver).sendKeys("M PANDIANKOTTAI, THIRUPPUVANAM, SIVAGANGA- 630611");
		
		PageObjectModel1.submitbutton(driver).click();
		
		
		
		
		
		
		
		
		// method 03
		
		driver.findElement(By.id("userName")).sendKeys("RADHAKRISHNAN A");
		driver.findElement(By.id("userEmail")).sendKeys("radhakrishnanof1995@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("M PANDIANKOTTAI, THIRUPPUVANAM, SIVAGANGA- 630611");
		driver.findElement(By.id("permanentAddress")).sendKeys("M PANDIANKOTTAI, THIRUPPUVANAM, SIVAGANGA- 630611");
		driver.findElement(By.id("submit")).click();
		
	}
	

	}


