package shop;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefination {
	WebDriver driver;
	@Given("user must be on home page by clicking on url {string}")
	public void user_must_be_on_home_page_by_clicking_on_url(String string) {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get(string);
	    
	}

	@When("user click on signup button")
	public void user_click_on_signup_button() throws InterruptedException {
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(2000);
	   
	}

	@When("signup dilogbox should be displayed")
	public void signup_dilogbox_should_be_displayed() {
		 driver.findElement(By.id("signInModalLabel")).isDisplayed();
	}

	@Then("User  enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
		driver.findElement(By.id("sign-username")).sendKeys(string);
	    driver.findElement(By.id("sign-password")).sendKeys(string2);
	  
	}

	@Then("Click on")
	public void click_on() throws InterruptedException {
		 driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
	     Thread.sleep(2000);
	    
	   Alert p=   driver.switchTo().alert();
	      
	      p.accept();
	      
	 Thread.sleep(2000);
	 driver.close();
	 
	   
	}

	@Given("user must be on homepage by clicking url {string}")
	public void user_must_be_on_homepage_by_clicking_url(String string) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get(string);
		   Thread.sleep(2000);
	}

	@Given("click on Login button1")
	public void click_on_login_button1() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
	}

	@When("Enter valid {string} and {string}")
	public void enter_valid_and(String string, String string2) {
		driver.findElement(By.id("loginusername")).sendKeys(string);
	    driver.findElement(By.id("loginpassword")).sendKeys(string2);
	    
	}

	@When("click on login button")
	public void click_on_login_button() {
		 WebElement element= driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
			element.click();
	}

	@Then("User must be navigated to his or her account")
	public void user_must_be_navigated_to_his_or_her_account() {

		  String actualresult=	 driver.getCurrentUrl();  
			Assert.assertEquals("https://www.demoblaze.com/", actualresult);}

	    
	

	@Given("user must be on home page by clicking on url2 {string}")
	public void user_must_be_on_home_page_by_clicking_on_url2(String string) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get(string);
		   Thread.sleep(2000);
	}

	@When("user click on laptop")
	public void user_click_on_laptop() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]")).click();
		Thread.sleep(3000);
	   
	}

	@When("Click on any laptop name")
	public void click_on_any_laptop_name() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
		   Thread.sleep(2000);
	}

	@When("click on Add to cart button")
	public void click_on_add_to_cart_button() throws InterruptedException {
	WebElement element=	driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a"));
	element.click();
	    Thread.sleep(2000);
	}

	@When("get pop up message")
	public void get_pop_up_message() throws InterruptedException {
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	   
	}

	@Then("user navigte to the cart")
	public void user_navigte_to_the_cart() {
		driver.findElement(By.id("cartur")).click();
	   
	}

}