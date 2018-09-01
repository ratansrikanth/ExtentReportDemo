package extentreport;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase01 extends TestBase{

	@Test
	public void search() {
		driver.findElement(By.name("q")).sendKeys("AndroidVenture");
		driver.findElement(By.name("q")).submit();
	}
	
	@Test(dependsOnMethods="search",alwaysRun=true)
	public void click() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div:nth-child(1) > div > div > h3 > a")).click();
		Assert.assertEquals(driver.getCurrentUrl(),"http://www.androidventure.co/");
		
	}
	
}
