package extentreport;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import extentreport.TestUtil;

import com.relevantcodes.extentreports.LogStatus;

public class TestNGListener extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = report.startTest(result.getName().toUpperCase());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		

			try {
				TestUtil.screenCapture();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		test.log(LogStatus.PASS, result.getName().toUpperCase());
		test.log(LogStatus.INFO, test.addScreenCapture(TestUtil.screenShotPath));
		report.endTest(test);
		report.flush();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			TestUtil.screenCapture();
		}catch(Exception e) {
			
		}
		
		test.log(LogStatus.FAIL, result.getName().toUpperCase());
		test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenShotPath));
		test.log(LogStatus.FAIL, result.getThrowable());
		report.endTest(test);
		report.flush();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
