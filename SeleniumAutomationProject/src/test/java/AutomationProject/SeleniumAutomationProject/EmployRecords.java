package AutomationProject.SeleniumAutomationProject;


	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	import org.testng.annotations.BeforeMethod;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;

	public class EmployRecords {

		WebDriver driver ;

	  @Test
	  public void Employ_Records() throws InterruptedException {
		  WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	      Username.sendKeys("Admin");
	      WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	      Password.sendKeys("admin123");
	      WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
	      Login.click();

	      WebElement Maintanance = driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[9]"));
	      Maintanance.click();
	      WebElement Password1 = driver.findElement(By.xpath("//input[@name=\"password\"]"));
	      Password1.sendKeys("admin123");
	      WebElement Confirm = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	      Confirm.click();
	      WebElement Access_records = driver.findElement(By.xpath("//li[@class=\"oxd-topbar-body-nav-tab\"]"));
	      Access_records.click();

	      WebElement Employ_name = driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]"));
	      Employ_name.sendKeys("o");
	      Thread.sleep(3000);
	      WebElement Select = driver.findElement(By.xpath("(//div[@role=\"option\"])[1]"));
	      Select.click();
	      WebElement Search = driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]"));
	      Search.click();

	      boolean verify = driver.findElement(By.xpath("//div[@class=\"orangehrm-selected-employee-image-wrapper\"]")).isDisplayed();
		  if(verify==true) {
			  System.out.println("The result is visible");
		  }
		  else {
			  System.out.println("The result is not visible");
		  }




	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }

	}


