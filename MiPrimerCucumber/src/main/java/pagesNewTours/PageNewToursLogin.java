package pagesNewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageNewToursLogin {

	protected WebDriver driver;
	private WebElement w;
	
	public void pagina() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	
	public void enterUserName(String userName) {
		w = driver.findElement(By.name("userName"));
		w.clear();
		w.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		w = driver.findElement(By.name("password"));
		w.clear();
		w.sendKeys(password);
	}
	public void clickSignIn() {
		driver.findElement(By.name("login")).click();
	}
	

}
