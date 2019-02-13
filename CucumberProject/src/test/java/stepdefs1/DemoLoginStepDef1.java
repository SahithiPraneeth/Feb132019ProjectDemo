package stepdefs1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoLoginStepDef1 {
	WebDriver driver;
	@Given("^Open the browser and pass the application URL$")
	public void open_the_browser_and_pass_the_application_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\karan\\drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://newtours.demoaut.com");
		  Thread.sleep(3000);
	}

	@When("^Enter the Valid User ID and Password$")
	public void enter_the_Valid_User_ID_and_Password() throws Throwable {
		  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("testusername");
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("testpassword");
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		  Thread.sleep(3000);
	}

	@Then("^Signout option should be visible in the next page$")
	public void signout_option_should_be_visible_in_the_next_page() throws Throwable {
		
		driver.close();
	}
}
