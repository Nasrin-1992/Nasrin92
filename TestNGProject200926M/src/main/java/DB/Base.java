package DB;

import java.io.File;
import java.io.IOException;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class Base {

	public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shamima Nasrin\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		  
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	
	public void failed(String testMethodName) {
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try {
			Files.copy(scrFile, new File("C:\\Users\\Shamima Nasrin\\eclipse-workspace\\TestNGProject200926M\\screenshorts\\"+ testMethodName+ "_"+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
	}


	
	
	
	
	
	
	
	
}
