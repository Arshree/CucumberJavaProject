package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_PF {
	
	WebDriver driver;
	
	@FindBy(xpath = "//button[text()='Open Menu']")
	WebElement menu;
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement btn_logout;
	
	public Homepage_PF(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void Menu() {
		menu.click();
	}
	
	public void Logout()
	{
		btn_logout.click();
	}

}
