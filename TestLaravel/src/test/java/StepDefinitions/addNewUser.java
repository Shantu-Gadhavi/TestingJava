package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class addNewUser {
	
	private static WebDriver driver = null;

	@Given("go to website and login with username and password")
	public void go_to_website_and_login_with_username_and_password() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		String url = "http://laravelcms-qa.devdigdev.com/admin";
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("monali.rana@devdigital.com");
		driver.findElement(By.id("password")).sendKeys("Mvc@082019");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
	}

	@When("verify that email is already exist")
	public void verify_that_email_is_already_exist() {
		
	}

	@When("if email not exist add new user")
	public void if_email_not_exist_add_new_user() {
		
	}

	@Then("verify the user on list page")
	public void verify_the_user_on_list_page() {
		
	}

}
