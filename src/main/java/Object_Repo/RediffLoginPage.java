package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	public WebDriver driver;
	
	
	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//user name selector
	By userName = By.name("login");
	//Password selector
	By passwd = By.id("password");
	//Sign in button Seletor
	By signIn = By.xpath("[value='Sign in']");
	
	//return webelement method for username
	//This method is public so that this webelement of this Login page can 
	//be used by different test class
	public WebElement userName() {
		
		return driver.findElement(userName);
	}
	
	//return webelement method for password
		//This method is public so that this webelement of this Login page can 
		//be used by different test class
	
	public WebElement passWord() {
		
		return driver.findElement(passwd);
	}
	
	//return webelement method for sign in Button
		//This method is public so that this webelement of this Login page can 
		//be used by different test class

	public WebElement signIN() {
	
	return driver.findElement(signIn);
}
	
	

}
