package package_E2E.project_E2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameter;
//import com.beust.jcommander.Parameters;
import org.testng.annotations.*;
//import org.testng.annotations.Parameter;
public class RediffLoginPage {
	
	@BeforeTest
	public void hi() {
		System.out.println("ji");
	}
	
	@Parameters({"kal"}) 
	@Test
	public void userNameTestExample1 (String username) {
		
		
		System.setProperty("webdriver.chrome.driver" , "H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Now Enter the texts in the username fields
		
		WebElement useName = driver.findElement(By.xpath("//*[@id = 'login1']"));
		useName.sendKeys(username);
		
		}
	
	//Using Test suit parameterisation 
	@Test
	public void userNameTestExample2 () {
		
		
		System.setProperty("webdriver.chrome.driver" , "H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Now Enter the texts in the username fields
		
		WebElement useName = driver.findElement(By.xpath("//*[@id = 'login1']"));
		useName.sendKeys("Testdata1");
		
		}

		
}
