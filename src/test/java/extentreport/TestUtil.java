package extentreport;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TestUtil extends TestBase{
	public static String screenShotName;
	public static String screenShotPath = System.getProperty("user.dir") + "\\target\\surefire-reports\\" + screenShotName + ".jpg";

	public static void screenCapture() throws IOException {
		Date date = new Date();
		screenShotName = date.toString().replaceAll(" ", "_").replaceAll(":", "_");
		screenShotPath = System.getProperty("user.dir") + "\\target\\surefire-reports\\" + screenShotName + ".jpg";
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File(screenShotPath));
		//File dest = new File(screenShotPath);
		//FileUtils.copyFile(scr, dest);
	}
}
