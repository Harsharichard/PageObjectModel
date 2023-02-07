package executeTestTs;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pages.DatePickersPage;

public class DatePickersTest extends BaseClass {
DatePickersPage datepickers;
String date="14-01-2023";
@Test
public void clickDate()
{
	datepickers=new DatePickersPage(driver);
	datepickers.clickOnDatePickers();
}
@Test
public void selectDate()
{
	datepickers=new DatePickersPage(driver);
	datepickers.clickOnDatePickers();
	datepickers.selectDate(date);
}
	
	
	
	
	
	
	
}
