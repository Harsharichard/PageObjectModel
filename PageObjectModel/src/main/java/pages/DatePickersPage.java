package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ulities.UtilitiesClass;

public class DatePickersPage {
WebDriver driver;
UtilitiesClass utilities;
@FindBy(xpath="(//a[@class='nav-link'])[3]")
WebElement datepicker;
@FindBy(xpath="//input[@class=\"form-control datepicker\"]")
WebElement selectdate;
@FindBy(xpath="(//th[@class=\"prev\"])[1]")
WebElement previousbutton;
@FindBy(xpath="(//th[@class=\"next\"])[1]")
WebElement nextbutton;
@FindBy(xpath = "//th[@class=\"datepicker-switch\"]")
WebElement monthName;

public DatePickersPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void clickOnDatePickers()
{
	datepicker.click();
}
public void selectDate(String date)
{
	selectdate.click();
	String split[]=date.split("-");  //convert string into int
	int m=Integer.parseInt(split[1]);
	String month="";
	switch(m)
		{
		case 1:
		month="January";
		break;
		case 2:
		month="February";
		break;
		case 3:
		month="March";
		break;
		case 4:
		month="April";
		break;
		case 5:
		month="May";
		break;
		case 6:
		month="June";
		break;
		case 7:
		month="July";
		break;
		case 8:
		month="August";
		break;
		case 9:
		month="September";
		break;
		case 10:
		month="October";
		break;
		case 11:
		month="November";
		break;
		case 12:
		month="December";
		break;
		
		}

	String day=split[0];
	String year=split[2];
	int y=Integer.parseInt(year);
	System.out.println(year+" "+month+" "+day);
	String month_year=month+" "+year;
			while(true)
				{
				String actualMonthText=monthName.getText();
				if(actualMonthText.equals(month_year))
			{
				break;
			}else if(m>=1&&y>=2023)
			{
				nextbutton.click();	
			}else
			{
				previousbutton.click();
			}
				}
	driver.findElement(By.xpath("//td[@class='day' and text()='"+day+"']")).click();
}







}
//previous= (//th[@class="prev"])[1]
//next= (//th[@class="next"])[1]
//month and year=  (//th[@class="datepicker-switch"])[1]
