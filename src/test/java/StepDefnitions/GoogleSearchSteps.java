package StepDefnitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver;

//	@Given("user go to google browser")
//	public void user_go_to_google_browser() {
//		driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@When("user enter text in searchbox")
//	public void user_enter_text_in_searchbox() throws InterruptedException {
//		driver.findElement(By.id("APjFqb")).sendKeys("Automation");
//		Thread.sleep(2000);
//	}
//
//	@And("click search button")
//	public void click_search_button() throws InterruptedException {
//		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		driver.getPageSource().contains("Automation");
//		//driver.close();
//		driver.quit();
//	}

}
