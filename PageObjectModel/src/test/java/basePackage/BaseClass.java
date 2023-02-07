package basePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 public WebDriver driver;
@BeforeMethod
public void launchBrowser()	
{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://selenium.obsqurazone.com/index.php");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().deleteAllCookies();

}

@AfterMethod
public void closeBrowser()
{
	
}

}
