package pageObjectModelWthoutannotaions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class WithoutindByAnnotations {
	
	// this method only can used for id or name available in the html site. 
	
	public static WebElement userName;
	public static WebElement userEmail;
	public static WebElement currentAddress;
	public static WebElement permanentAddress;
	public static WebElement submit;

	
	@Test
	public void test1() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		PageFactory.initElements(driver,this);
		
		userName.sendKeys("RADHAKRISHNAN A");
		userEmail.sendKeys("radhakrishnanof1995@gmail.com");
		currentAddress.sendKeys("M PANDIANKOTTAI, THIRUPPUVANAM, SIVAGANGA- 630611");
		permanentAddress.sendKeys("M PANDIANKOTTAI, THIRUPPUVANAM, SIVAGANGA- 630611");
		submit.click();
	}
}
