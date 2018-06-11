package TestCases;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_02 {
	@Test
	public void testcase2()throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver", "E:\\PracticeWorkspace\\E2EIntegration\\Drivers\\geckodriver.exe");

		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.faceook.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("rupam_life@yahoo.co.in");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("asl@1234");
		
		driver.quit();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		//Thread.sleep(2000);
	}


}
