package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_01 {
@Test
public void testcase1() throws InterruptedException 
{System.setProperty("webdriver.chrome.driver","E:\\PracticeWorkspace\\E2EIntegration\\Drivers\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("http://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("rupam_life@yahoo.co.in");
	driver.quit();
	//driver.findElement(By.id("pass")).sendKeys("asl@1234");
	
}
}
