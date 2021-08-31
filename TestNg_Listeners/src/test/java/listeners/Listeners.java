package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Listeners extends PHP_Travels implements ITestListener{
	     
	ExtentReports extent = Extentreport_PHP.CreateTest();
	ExtentTest test;
	    
	   
	public void onFinish(ITestContext arg0) {
		
        extent.flush();
	}

	public void onStart(ITestContext arg0) {
		
        test = extent.createTest("Test_PHPTravels");
        test.assignAuthor("Vigneshwar");
        test.assignCategory("Functional Testing");
        System.out.println("Test Started");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		 System.out.println("100 percentage done");
		
	}

	public void onTestFailure(ITestResult arg0) {
		test.fail("Login Successfully not Executed");
        test.fail("Navigation to product page not successful");
        test.fail("Purchase not successful");   
        System.out.println("login is failed");
	}

	public void onTestSkipped(ITestResult arg0) {

	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		 	test.pass("Login Successfully Executed");
	        test.pass("Navigation to product page successful ");
	        test.pass("Purchase successful");
		
	}

}
