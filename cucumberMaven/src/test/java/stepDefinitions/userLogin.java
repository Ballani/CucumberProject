package stepDefinitions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageSteps.userSteps;

public class userLogin {
	
	WebDriver driver=null;
	userSteps uSteps;
	
	@Given("user on login page")
	public void user_on_login_page(){
		System.out.println("In the login page");
		
		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://example.testproject.io/web/");
		driver.manage().window().maximize();
		
		
	}
	
	//userlogin

	@When("^user enters username (.*?) and password (.*?)$")
	public void user_enters_username_kesava_and_password(String username,String password) {
		uSteps=new userSteps(driver);
	    System.out.println(username+" is the UserName");
	    System.out.println(password+" is the Password");
	    uSteps.userLogin(username, password);
	    
	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
		System.out.println("In the login button function");
		uSteps=new userSteps(driver);
		uSteps.clickLogin();
	}
	
	@Then("user navigates to homescreen")
	public void user_navigates_to_homescreen() {
		System.out.println("In the homescreen function");
		uSteps=new userSteps(driver);
		uSteps.clickLogout();
		driver.close();
		driver.quit();
		
	}

}
