package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	//Step 1:- POM Classes are no of web pages to be handle = no of POM Class
	//Step 2:- The different web element on a web page are define as a variable in a class
	//POM Class strictly follows Encapsulation concept where:-
	//1) D.M. should be declear globally with access level "Private".
	//2) To initialize methods with contructor with the access level "public" we need to use PageFactory
	
	
	@FindBy(xpath = "//input[@id='userid']") WebElement UN;
	@FindBy(xpath = "//input[@id='password']") WebElement PASS;
	@FindBy(xpath = "//button[@class='button-orange wide']") WebElement CLICK;
	

	//Step 3:- To initialize DAta Member or variable in PageFactory we use initElement method
	//with the Encapsulation concept
	
	
     public login (WebDriver Driver) {
    	 
    	 PageFactory.initElements(Driver, this);
    	 
     }
     
	//Usage
     // Call a non static method pass method name, pass argument in which pass the data type of credentials if necessary.
     // then in method body pass web element and call methods.
     
     
     public void Enter_userid(String userid) {
		UN.sendKeys(userid);
	}
	
	public void Enter_password(String Password) {
		PASS.sendKeys(Password);
	}
	
	public void click_to_continue() {
		CLICK.click();
	}
	
	
	
	
	
	
	
	
	
	
}
