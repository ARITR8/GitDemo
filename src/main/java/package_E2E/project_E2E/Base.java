package package_E2E.project_E2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Base {
	
	private ExpectedCondition<Boolean> pageTitleStartsWith(final String searchString)
	{
		return driver -> driver.getTitle().startsWith(searchString.toLowerCase());
		//user 2 added code
		System.out.println("Fine code example");
		//user one added new line
		//these chsnges sare done on the master branch
		//I will noot make any changes to the master branch

	}
	
	
	private void googleExampleThatSearchesFor(final String searchstring) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver" , "H:\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.clear();
		searchField.sendKeys(searchstring);
		System.out.println("The Page Title is " + driver.getTitle());
		searchField.submit();
		WebDriverWait wait = new WebDriverWait(driver, 10, 100);
		wait.until(pageTitleStartsWith(searchstring));
		System.out.println("Page title is " + driver.getTitle());
		driver.quit();
		
		
	}
	

	
	
	@Test
	public void googleCheeseExample() {
		googleExampleThatSearchesFor("Cheese");
	}
	
	
}
