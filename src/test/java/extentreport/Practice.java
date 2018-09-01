package extentreport;

import java.util.Date;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		String screenShotName = date.toString().replaceAll(" ", "_").replaceAll(":", "_");
		String screenShotPath = System.getProperty("user.dir") + "\\target\\surefire-reports\\" + screenShotName
				+ ".jpg";
		System.out.println(screenShotName);
		System.out.println(screenShotPath);
	}

}
