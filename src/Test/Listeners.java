package Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	 @Override
	    public void onTestStart(ITestResult result) {
	        
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {

            System.out.println("i am from listeners on test case pass");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
            System.out.println("i am from listeners on test case fail");
           System.out.println(result.getTestName());


	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        // Your implementation
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        // Your implementation
	    }

	    @Override
	    public void onStart(ITestContext context) {
	        // Your implementation
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        // Your implementation
	    }
}
