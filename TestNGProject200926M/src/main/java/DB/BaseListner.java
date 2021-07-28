package DB;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class BaseListner extends Base implements ITestListener {
	 public void onFinish(ITestContext Result) {					
	    //  System.out.println(Result.getName()+ "is finished"); 			
	        		
	    }		

	   	
	    public void onStart(ITestContext Result) {					
	     //  System.out.println(Result.getName() + "is started"); 			
	        		
	    }		

	    		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {					
	       				
	        		
	    }		

	   	
	    public void onTestFailure(ITestResult Result) {					
	       				
	       System.out.println("is Failed"); 
	       failed(Result.getMethod().getMethodName());
	    }		

	   	
	    public void onTestSkipped(ITestResult Result) {					
	    	//System.out.println(Result.getName()+"is Skip");	
	        		
	    }		

	    		
	    public void onTestStart(ITestResult Result) {					
	      			
	       // System.out.println(Result.getName()+"is TestStarted");		
	    }		

	  	
	    public void onTestSuccess(ITestResult Result) {					
	      		
	        	//System.out.println(Result.getName()+"is TestSucced");	
	    }		

}
