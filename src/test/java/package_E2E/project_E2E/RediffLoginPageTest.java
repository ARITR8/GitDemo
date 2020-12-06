package package_E2E.project_E2E;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Object_Repo.RediffLoginPage;

public class RediffLoginPageTest {
	
	@Test 
	public void RediffLoginTestcase() {
	
	System.setProperty("webdriver.chrome.driver" , "H:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	RediffLoginPage loginPageObject = new RediffLoginPage(driver);
	//Action 1:- Enter the Username
	loginPageObject.userName().sendKeys("username");
	//Action 2:- Enter the Password.
	loginPageObject.passWord().sendKeys("password");
	//Action 3:- Click on the Sign in Button.
	loginPageObject.signIN().click();
	
}
	
}
