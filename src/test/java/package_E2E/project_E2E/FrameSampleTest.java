package package_E2E.project_E2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameSampleTest {
	
	@Test
	public void testFrame() {
		System.setProperty("webdriver.chrome.driver" , "H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//Now select the frame
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.switchTo().frame(1);
		//should be actual element class
		//but using wrong class name 
		//driver.switchTo().frame(driver.findElement(By.className("XXX")));
	}

}
