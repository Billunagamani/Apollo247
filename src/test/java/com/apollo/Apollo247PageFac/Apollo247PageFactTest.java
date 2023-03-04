package com.apollo.Apollo247PageFac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.apollo.Apollo247Page.Homepagefactory;

public class Apollo247PageFactTest {
	WebDriver driver = null;
  @Test
  public void verification() throws InterruptedException {
	  System.setProperty("WebDriver.chrome.driver","‪chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.apollo247.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("wzrk-cancel")).click();
	  Thread.sleep(1000);
	 
	  Homepagefactory hf =new Homepagefactory(driver);
	  hf.Login();
	  hf.mobilenumber();
	  hf.SubmitBtn();
	  hf.Login1();
	  Thread.sleep(1000);
	  hf.BookAppointment();
	  Thread.sleep(1000);
      hf.Mediciens();
      Thread.sleep(1000);
      hf.BookLabTests();
      Thread.sleep(1000);
	  hf.Healthrecords();
	  Thread.sleep(1000);
	 }
}
