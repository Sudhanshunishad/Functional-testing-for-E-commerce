package testcases;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	@Test
	public void Homepage() throws InterruptedException {		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost/index.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		Actions action = new Actions(driver);				
		WebElement path = driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Shop']"));
		action.moveToElement(path).build().perform();		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Dresses")));		
		WebElement ele = driver.findElement(By.linkText("Dresses"));
		action.moveToElement(ele);
		action.click().build().perform();
		driver.close();
	}
	@Test
	public void Contactpage() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost/index.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		Actions action = new Actions(driver);				
		WebElement path = driver.findElement(By.xpath("//a[contains(text(),'Pages')]"));
		action.moveToElement(path).build().perform();		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Contact")));		
		WebElement ele = driver.findElement(By.linkText("Contact"));
		action.moveToElement(ele);
		action.click().build().perform();
		driver.close();
				
	}

}

