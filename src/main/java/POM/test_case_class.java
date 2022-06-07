package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class test_case_class {

	
	@FindBy(xpath = "//a[@class='orders-nav-item']") WebElement Order;
	@FindBy(xpath = "//span[@class='user-id']") WebElement verify_ID;
	@FindBy(xpath = "//span[@class='user-id']") WebElement USERID;
	
	public test_case_class(WebDriver Driver) {
		
		PageFactory.initElements(Driver, this);
		
	}
	
  //  public void Click_order() {
	//	Order.click();
	//}
	
	public void verify_userid(String exp_id) {
		
		String act_id = verify_ID.getText();
			
		if (act_id.equals(exp_id)) {
			System.out.println("Test is Pass");
		}
		else 
		{
        System.out.println("Test is Fail"); 
		}
	}
	
	//public void Click_userid() {
		//USERID.click();
	//}
	
	//public void dropdown() {
		//Select sel1 = new Select(USERID);
		//sel1.selectByVisibleText("Support");
	//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
