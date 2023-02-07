package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
WebDriver driver;
public HomePage(WebDriver driver1)
{
	 this.driver=driver1;
}
public void printTitle()
{
	driver.getTitle();
	
}
public boolean isLogoDisplayed()
{
	WebElement element=driver.findElement(By.xpath("(//img[@src='images/logo.png'])[1]"));
	boolean a=element.isDisplayed();
	//System.out.println(a);
	return a;
}
}
