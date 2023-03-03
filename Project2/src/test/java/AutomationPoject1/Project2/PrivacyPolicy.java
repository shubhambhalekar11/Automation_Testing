package AutomationPoject1.Project2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrivacyPolicy {
	WebDriver driver;
	  
	 @Test
	 public void homePage() throws IOException {
		  
		    FileInputStream fis = new FileInputStream("C:\\Users\\mahes\\Desktop\\Project2\\src\\test\\java\\com\\utils\\data.properties");
		    Properties p = new Properties();
		    p.load(fis);
		  
	        WebElement home = driver.findElement(By.xpath(p.getProperty("PrivacyPolicy")));
	        home.click();
	        
	       
		  
		  
	  }
	  
	 @BeforeClass
	 public void launchURL() throws IOException {
		  
		  
		    WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			FileInputStream fis = new FileInputStream("C:\\Users\\mahes\\Desktop\\Project2\\src\\test\\java\\com\\utils\\data.properties");
		    Properties p = new Properties();
		    p.load(fis);
		    
		    driver.get(p.getProperty("url"));
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		  
		}

	  

	 @AfterClass
	 public void closeBrowser() {
		  
		    driver.close();
		
	}

	}



