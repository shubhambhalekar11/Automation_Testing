package AutomationProject.SeleniumAutomationProject;


	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	import org.testng.annotations.BeforeMethod;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;
	public class EmployReview {

		WebDriver driver ;

	  @Test
	  public void Employ_Review() throws InterruptedException {

		  //Entering Username password and clicking on Login
		  WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	      Username.sendKeys("Admin");
	      WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	      Password.sendKeys("admin123");
	      WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
	      Login.click();

		  WebElement performance = driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[7]"));
		  performance.click();
		  WebElement inputHint = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		  inputHint.sendKeys("Peter Mac Anderson");
		  WebElement JobTitle = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
		  JobTitle.click();
		  WebElement Account_assistant = driver.findElement(By.xpath("(//div[@role='option'])[2]"));
		  Account_assistant.click();
		  WebElement Sub_Unit = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]"));
		  Sub_Unit.click();
		  WebElement OrangeHrm = driver.findElement(By.xpath("(//div[@role='option'])[2]"));
		  OrangeHrm.click();

		  WebElement Include = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
		  Include.click();
		  WebElement CurrentEmploy = driver.findElement(By.xpath("(//div[@role=\"option\"])[2]"));
		  CurrentEmploy.click();

		  WebElement ReviewStatus = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[4]"));
		  ReviewStatus.click();
		  WebElement Activated = driver.findElement(By.xpath("(//div[@role=\"option\"])[2]"));
		  Activated.click();

		  WebElement StartDate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[1]"));
		  StartDate.click();
		  WebElement Start_Year = driver.findElement(By.xpath("(//p[@class=\"oxd-text oxd-text--p\"])[2]"));
		  Start_Year.click();
		  WebElement Select_Start_Year = driver.findElement(By.xpath("(//li[@class=\"oxd-calendar-dropdown--option\"])[48]"));
		  Select_Start_Year.click();
		  WebElement Start_Date = driver.findElement(By.xpath("(//div[@class=\"oxd-calendar-date\"])[18]"));
		  Start_Date.click();

		  WebElement ToDate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[2]"));
		  ToDate.click();
		  Thread.sleep(3000);
		  WebElement To_Month = driver.findElement(By.xpath("(//p[@class=\"oxd-text oxd-text--p\"])[1]"));
		  To_Month.click();
		  WebElement Select_To_Month = driver.findElement(By.xpath("(//li[@class=\"oxd-calendar-dropdown--option\"])[1]"));
		  Select_To_Month.click();
		  WebElement To_Date = driver.findElement(By.xpath("(//div[@class=\"oxd-calendar-date\"])[11]"));
		  To_Date.click();


		  WebElement Search = driver.findElement(By.xpath("//button[@type='submit']"));
		  Search.click();




		  Thread.sleep(3000);
		  //WebElement Job_Title = driver.findElement(By.xpath("//div[contains(text(),'Chief Executive Officer')]"));
		  //Job_Title.click();
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }

	}


