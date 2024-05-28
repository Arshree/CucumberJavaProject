package StepDefnitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksUsing {

	WebDriver driver;
	
	@Before
	public void browsersetup() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.println("I am inside the browser");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@After
	public void closebrowser() {
		
	
		driver.close();
		driver.quit();
		System.out.println("I ma closing this browser");
	}
	
	
	@BeforeStep
	public void beforesteps() {
		System.out.println("Before Steps");
	}
	
	@AfterStep
	public void aftersteps() {
		System.out.println("After steps");
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
	}
	
	@When("user enter valid credentials")
	public void user_enter_valid_credentials() {

	}

	@And("user click login button")
	public void user_click_login_button() {
		
	}
	
	@Then("user logout application")
	public void user_logout_application() {

	}

}
