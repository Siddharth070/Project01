package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pin {

	
	@FindBy(xpath = "//input[@id='pin']") WebElement PIN;
	@FindBy(xpath = "//button[@class='button-orange wide']") WebElement Login;
	
	public pin(WebDriver Driver) {
		
		PageFactory.initElements(Driver, this);
	}
	
	
	public void Enter_pin(String Tpin) {
		PIN.sendKeys(Tpin);
	}
	
	public void Continue() {
	Login.click();	
	}
	
	
	
	
	
	
	
	
	
	
	
}
