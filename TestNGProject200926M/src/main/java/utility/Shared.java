package utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Shared {
WebDriver dr;
	

@Test
public void test1() {
	String [] x= {"fdh", "sdfg" , "rtyujk"};
	ArrayList <String> ac = actValue(dr.findElements(By.xpath("")));
	
	ArrayList<String> ex= exValue(x);
	compareTexValue(ex,ac);

}//end
	
	public void  compareTexValue (ArrayList<String> exValue, ArrayList<String> actValue) {
	Iterator<String> e=exValue.iterator();
	Iterator<String> a= actValue.iterator();
	
	while(e.hasNext()&&a.hasNext()) {
		Assert.assertTrue(e.next().equals(a.next()));
	}//and while
		
	}
	
	public ArrayList<String> exValue(String [] ex) {
		ArrayList <String> ar = new ArrayList();
		for(String x:ex) {
			ar.add(x);
		}
		return ar;
	}
	
	public ArrayList<String> actValue(List<WebElement> elements) {
		ArrayList<String> ar = new ArrayList<String>();
		for( WebElement element:elements) {
			String value =element.getText();
			ar.add(value);
		}
	
          return ar;
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
