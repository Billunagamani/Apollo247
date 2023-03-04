package com.apollo.Apollo247;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.apollo.Apollo247Page.Homepagefactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageStepDefinition {
	WebDriver driver;
	@Given("user on the Apollo247 home page")
	public void user_on_the_Apollo247_home_page() throws InterruptedException {
		 System.setProperty("WebDriver.chrome.driver","‪chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.apollo247.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("wzrk-cancel")).click();
		 Thread.sleep(1000);
		 
	   
	}

	@Given("user clicks on login button")
	public void user_clicks_on_login_button() {
	    Homepagefactory hf = new Homepagefactory(driver);
	    hf.login.click();
	    
	}

	@When("user is able to give mobile number")
	public void user_is_able_to_give_mobile_number() {
	   Homepagefactory hf = new Homepagefactory(driver);
	   hf.mobileno.sendKeys("6281811022");
	   hf.mobileArrow.click();
	}

	@When("user is able to write OTP")
	public void user_is_able_to_write_OTP() throws InterruptedException {
		 Homepagefactory hf = new Homepagefactory(driver);
		 Thread.sleep(50000);
		 hf.otpArrow.click();
	    
	}
	@Then("user is able to login to see with name")
	public void user_is_able_to_login_to_see_with_name() throws InterruptedException {
		Thread.sleep(30000);
		Homepagefactory hf = new Homepagefactory(driver);
		hf.login.click();
	}
	@Given("user is on the Apollo247 homepage")
	public void user_is_on_the_Apollo247_homepage() throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","‪chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.apollo247.com/");
		driver.findElement(By.id("wzrk-cancel")).click();
		//validation of url
		String excepted_title="Apollo 247 - Online Doctor Consultation & Book Lab Tests at Home";
		String actual_title=driver.getTitle();
		assertEquals(excepted_title, actual_title);
	    driver.findElement(By.xpath("//h3[@title='Book Appointment with Apollo Doctors']")).click();
		Thread.sleep(3000);
		
	}
	@Then("user is able to navigate to online consultation page")
	public void user_is_able_to_navigate_to_online_consultation_page() {
		driver.navigate().back();
	}
    @When("user is able to click on Book appointment with Apollo Doctors")
	public void user_is_able_to_click_on_Book_appointment_with_Apollo_Doctors() throws InterruptedException {
	    
	}
	
	@When("user is able to click on buy medicines and essentials button")
	public void user_is_able_to_click_on_buy_medicines_and_essentials_button() throws InterruptedException {
	    driver.findElement(By.xpath("//a[@href=\"https://www.apollopharmacy.in\"]")).click();
	    Thread.sleep(1000);
	}

	@Then("user is able to navigate to pharmacy page")
	public void user_is_able_to_navigate_to_pharmacy_page() {
	   driver.navigate().back();
	}
	@When("user is able to click on Book lab tests button")
	public void user_is_able_to_click_on_Book_lab_tests_button() throws InterruptedException {
	    driver.findElement(By.xpath("//a[@href='/lab-tests']")).click();
	    Thread.sleep(1000);
	}
    @Then("user is able to navigate to lab tests page")
	public void user_is_able_to_navigate_to_lab_tests_page() {
    	driver.navigate().back();
    }
    @When("user is able to click view health records button")
	public void user_is_able_to_click_view_health_records_button() throws InterruptedException {
    	System.setProperty("WebDriver.chrome.driver","‪chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.apollo247.com/");
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.xpath("//h3[@title='View Health Records']")).click();
		Thread.sleep(1000);
	}
    @Then("user is able to navigate to health records page")
	public void user_is_able_to_navigate_to_health_records_page() {
	    driver.navigate().back();
	}
}  