package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ulities.UtilitiesClass;

public class TablePage {
WebDriver driver;
UtilitiesClass utilities;

@FindBy(xpath = "(//a[@class='nav-link'])[4]")
WebElement tableLink;
@FindBy(xpath = "//table[@id='dtBasicExample']//tbody//tr[1]//td[1]")
WebElement nameOfperson;

public TablePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);//access webelements by pagefactory we use this
}

public void clickOnTable()
{
	
	tableLink.click();
}
public void printText()
{
	UtilitiesClass utilities=new UtilitiesClass(driver);
	String p=utilities.getTextOfElement(nameOfperson);
	System.out.println(p);
}
public boolean is_PersonPresent()
{
	 utilities=new UtilitiesClass(driver);
	return utilities.is_TextPresent(nameOfperson,"Tiger Nixon");
	
}
public List<String> printNames(String xpath)
{
	 utilities=new UtilitiesClass(driver);
	 return utilities.getTextOfElements(xpath);

}

public String getOfficeOfPerson(String personName)
{
	int i;
	 utilities=new UtilitiesClass(driver);
	 List<String>names=new ArrayList<String>();
	names=utilities.getTextOfElements("//table[@id='dtBasicExample']//tbody//tr//td[1]");
	for(i=0; i<names.size();i++)//String person_names :names) 
	{
	if(personName.equals(names.get(i)))
	{
		i++;
		break;
	}
	}
	WebElement officeText=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+i+"]//td[3]"));	
	return officeText.getText();
}



}
//table[@id='dtBasicExample']//tbody//tr[3]//td[3]
