package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	protected WebDriver driver;
	//WebDriver driver = new chromeDriver();
	
	private By menu = By.id("react-burger-menu-btn");
	private By btn_logout = By.id("logout_sidebar_link");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void Menu() {
		driver.findElement(menu).click();
	}
	
	public void LogOut() {
		driver.findElement(btn_logout).click();
	}

}
