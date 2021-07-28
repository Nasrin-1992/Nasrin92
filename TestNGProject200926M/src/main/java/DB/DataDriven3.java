package DB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.dataDrivenUtil;

public class DataDriven3 {
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shamima Nasrin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://login.target.com/gsp/static/v1/login/?client_id=ecom-web-1.0.0&ui_namespace=ui-default&back_button_action="
				+ "browser&keep_me_signed_in=true&kmsi_default=false&actions=create_session_create_account");
	}
	
	@DataProvider
	public void getTestData() {
       dataDrivenUtil.getData();
		 
	}
	
	
	
	

	@Test(dataProvider="getTestData")
	public void datadrivenpractice(String Emailaddress,String Firstname,String Lirstname, String phoneNumbe, String password) {
		//enter data
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Emailaddress);
		
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(Firstname);
		
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(Lirstname);
		
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys(phoneNumbe);
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
	}
	
	
	
	public void close() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
}
