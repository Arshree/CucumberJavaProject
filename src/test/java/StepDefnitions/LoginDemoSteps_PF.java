package StepDefnitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.Homepage_PF;
import PageFactory.LoginPage_PF;
import io.cucumber.java.en.*;

public class LoginDemoSteps_PF {

//	WebDriver driver;
//	LoginPage_PF login;
//	Homepage_PF home;
//
//
//	@Given("user go to browser")
//	public void user_go_to_browser() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize(); 
//	}
//
//	@And("user go to login page")
//	public void user_go_to_login_page() throws InterruptedException {
//		driver.get("https://www.saucedemo.com/");
//		Thread.sleep(2000);
//	}
//
//	@When("user enters {string} and {string}")
//	public void user_enters_and(String username, String password) {
//
//		login = new LoginPage_PF(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//
//	}
//
//	@And("user click login button")
//	public void user_click_login_button()
//	{
//		login.clicklogin();
//
//	}
//
//
//
//	@Then ("user click logout button")
//	public void user_click_logout_button() throws InterruptedException
//	{
//		home = new Homepage_PF(driver);
//		home.Menu();
//
//
//		Thread.sleep(2000);
//		home.Logout();
//
//
//		driver.close();
//		driver.quit();
//	}


}
