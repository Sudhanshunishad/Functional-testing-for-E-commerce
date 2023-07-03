package stepdefination;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddtoCart {
	
	ChromeDriver driver;
	
	@Given("User is on Chrome Browser and is able to access ecommerce webpage")
	public void Homepage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/");
	}
	
	@Given("User click on Add to Cart button")
	public void addtocart_button() {
		driver.findElement(By.xpath("//a[@id='essenceCartBtn']")).click();
	}
	
	@Then("Check if checkout button is clickable or not")
	public void checkout_button() throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'check out')]"));
		Thread.sleep(2000);
		ele.click();
	}
	
	@Then("Check if checkout page is displayed or not")
	public void Checkout_page() {
		
		String title = driver.getTitle();
		String currentpageurl = driver.getCurrentUrl();
		String expectedpageurl = "http://localhost/checkout.html";
		
		Assertions.assertEquals(expectedpageurl, currentpageurl);
		System.out.println(title);
		
	}
	
@And("Enter the values to fill up the billing address")

	public void billing_address() {
		
	driver.findElement(By.cssSelector("#first_name")).clear();
	driver.findElement(By.cssSelector("#first_name")).sendKeys("Krish");
	driver.findElement(By.cssSelector("#last_name")).clear();
	driver.findElement(By.cssSelector("#last_name")).sendKeys("Krishna");
	driver.findElement(By.cssSelector("#company")).clear();
	driver.findElement(By.cssSelector("#company")).sendKeys("Simplilearn");
	driver.findElement(By.xpath("//input[@id='street_address']")).clear();
	driver.findElement(By.xpath("//input[@id='street_address']")).sendKeys("Ho.No 1/4");
	driver.findElement(By.xpath("//input[@id='street_address']")).clear();
	driver.findElement(By.xpath("//input[@id='street_address']")).sendKeys("Gandhi nagar");
	driver.findElement(By.cssSelector("#postcode")).clear();
	driver.findElement(By.cssSelector("#postcode")).sendKeys("500545");
	driver.findElement(By.cssSelector("#city")).clear();
	driver.findElement(By.cssSelector("#city")).sendKeys("Hyderabad");
	driver.findElement(By.xpath("//input[@id='state']")).clear();
	driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Telanaga");
	driver.findElement(By.xpath("//input[@id='phone_number']")).clear();
	driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("919754678932");
	driver.findElement(By.cssSelector("#email_address")).clear();
	driver.findElement(By.cssSelector("#email_address")).sendKeys("abc@example.com");
	
	
}

@And("Click on Place order button")
public void plc_ordr_btn() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Place Order')]")).click();
}
	
@And("User Closed the Chrome Browswer")
public void close_browser() {
	driver.close();
}
}
