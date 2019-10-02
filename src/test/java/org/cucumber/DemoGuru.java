package org.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoGuru {
	static WebDriver driver;
	@Given("user is in guru telecom page and clicks add customer")
	public void user_is_in_guru_telecom_page_and_clicks_add_customer() {

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\greens tech\\Desktop\\mahesh\\CucumberSample\\driver\\chromedriver.exe" );
				   driver=new ChromeDriver();
				   driver.get("http://demo.guru99.com/telecom/index.html");
				   driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();

	   
	}

	@When("user fills all the fields and clicks submit button {string},{string},{string},{string},{string}")
	public void user_fills_all_the_fields_and_clicks_submit_button(String string, String string2, String string3, String string4, String string5) {
		driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(string);
	    driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(string2);
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(string3);
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(string4);
	    driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(string5);
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
	   
	}

	@Then("user verifies whether customer id is displayed")
	public void user_verifies_whether_customer_id_is_displayed() {
		WebElement txt = driver.findElement(By.xpath("//b[text()='Please Note Down Your CustomerID']"));
		String text = txt.getText();
		if(text.equals("Please Note Down Your CustomerID")) {
			System.out.println("customer added successfully");
		}
		else {
			System.out.println("customer not added");
		}
	   
	    
	}


}



