package StepDefnitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginDemoSteps {

//	WebDriver driver;
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
//	public void user_enters_and(String Username, String Password) {
//		
//		
//		driver.findElement(By.id("user-name")).sendKeys(Username);
//		driver.findElement(By.id("password")).sendKeys(Password);
//		System.out.println("Entering username: " + Username + " and password: " + Password);
//	}
//
//	@And("user click login button")
//	public void user_click_login_button()
//	{
//		driver.findElement(By.id("login-button")).click();
//	}
//
//
//
//	@Then ("user click logout button")
//	public void user_click_logout_button()
//	{
//		
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
//		
//		driver.close();
//		driver.quit();
//	}


}
