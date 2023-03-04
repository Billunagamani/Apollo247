package com.apollo.Apollo247Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepagefactory {
	WebDriver driver=null;
	@FindBy(xpath="//span[@class=\"icon-ic_account\"]")
	public WebElement login;
	
	@FindBy(xpath="//input[@name=\"mobileNumber\"]")
	public WebElement mobileno;
	
	@FindBy(css="span[class=\"MuiFab-label\"]")
	public WebElement mobileArrow;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	public WebElement otpArrow;
	
	@FindBy(css="span[class=\"MuiFab-label\"]")
	public WebElement login1;
	
	@FindBy(xpath=("\"//h3[@title='Book Appointment with Apollo Doctors']"))
    public WebElement bookAppointmentbtn;
	
	@FindBy(xpath=("a[@href=\"https://www.apollopharmacy.in\"]"))
	public WebElement mediciens;
	
	@FindBy(xpath=("//h3[@title=\"Book Lab Tests\"]"))
	public WebElement booklabtests;
	
	@FindBy(xpath=("//h3[@title='View Health Records']"))
	public WebElement Healthrecords;
	
    public Homepagefactory(WebDriver driver) {
    this.driver = driver;
	PageFactory.initElements(driver,this);
    }
    public void Login()
    {
     login.click();
    }
    public void mobilenumber() {
    	mobileno.click();
    	mobileno.sendKeys("6281811022");
    }
    public void SubmitBtn() {
    	mobileArrow.click();
    }
    public void Login1() throws InterruptedException {
    	Thread.sleep(1000);
    	login1.click();
    }
    public void BookAppointment() {
    	
		bookAppointmentbtn.click();
		driver.navigate().back();
    }
	public void Mediciens() {
		mediciens.click();
		driver.navigate().back();
		
	}
	public void BookLabTests() {
		booklabtests.click();
		driver.navigate().back();
	}
	public void Healthrecords() {
		Healthrecords.click();
		driver.navigate().back();
	}
}
