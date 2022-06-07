package Test_Class1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_annotations {

	Sheet sh;
	WebDriver Driver;
	login page1;
	pin page2;
	test_case_class page3;
	
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Icon\\Desktop\\New Microsoft Office Excel Worksheet (2).xlsx");
		sh = WorkbookFactory.create(file).getSheet("sheet1");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("-----Disable Notification----");
		
		System.setProperty("webdriver.chrome.driver", "F:\\software for testing\\chromedriver.exe");
		Driver = new ChromeDriver(opt);
		
		Driver.get("https://kite.zerodha.com/");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		page1 = new login(Driver);
		page2 = new pin(Driver);
		page3 = new test_case_class(Driver);
		
	}
	
	@BeforeMethod
	public void loginapplication() throws InterruptedException {
		
		page1.Enter_userid(sh.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		page1.Enter_password(sh.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		page1.click_to_continue();
		Thread.sleep(2000);
		
		page2.Enter_pin(sh.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(2000);
		page2.Continue();
		Thread.sleep(2000);
	}
	
	@Test
	public void verify_text() throws InterruptedException {
		
		page3.verify_userid(sh.getRow(0).getCell(3).getStringCellValue());
		Thread.sleep(2000);
		
		
	}
	
	@AfterMethod
	public void logout() throws InterruptedException {
		
		Reporter.log("----LOGOUT-----", true);
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void quit() {
		
		Driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
