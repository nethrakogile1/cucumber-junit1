package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	
	WebDriver driver;
	@Given("I am able to navigate onto the login page")
	public void i_am_able_to_navigate_onto_the_login_page() {
		
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\NETHRAVATHIGOPALAGOW\\Desktop\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		    //this is to open the new instance of browser
		    driver = new FirefoxDriver();
		    //this is basically to open the application
		    driver.get("http://opensource-demo.orangehrmlive.com/");
		    //max the screen
		    driver.manage().window().maximize();
		    //if i want to wait
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}

	
	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String string) {
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	}
	
	
	
	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String string) {
		driver.findElement(By.id("txtPassword")).sendKeys(string);
		
	}
	
	
	
	@When("I click on the Login button")
	public void i_click_on_the_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Then("I should see the user name as {string}")
	public void i_should_see_the_user_name_as(String string) {
	    
		 String name = driver.findElement(By.id("welcome")).getText();
		    String Actualdata = string;
		    Assert.assertEquals(name,Actualdata);
		    System.out.println("login succesfully");	
		    driver.close();
	}
	
	
		@Then("I should see the error message as {string}")
		public void i_should_see_the_error_message_as(String string) {
			String name =driver.findElement(By.id("spanMessage")).getText();
			
			String expected="Invalid credentials";
			Assert.assertEquals(name,expected);
			driver.close();
		}

}
