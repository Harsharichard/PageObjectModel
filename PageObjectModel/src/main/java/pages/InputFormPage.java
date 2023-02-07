package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage {
	By inputForm=By.xpath("//a[contains(text(),'Input Form')]");
	By enterMsg=By.xpath("//input[@id='single-input-field']");
WebDriver driver;
public InputFormPage(WebDriver driver)
{
	this.driver=driver;
}
public void click_On_InputForm()
{
	WebElement element=driver.findElement(inputForm);
	element.click();
}
public  String EnterMsgField(String msg)
{
	
	WebElement msg1=driver.findElement(enterMsg);
	//msg.sendKeys("Harsha");
	return msg;
}


	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	

