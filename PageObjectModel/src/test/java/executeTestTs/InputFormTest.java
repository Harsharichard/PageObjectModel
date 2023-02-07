package executeTestTs;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pages.InputFormPage;

public class InputFormTest extends BaseClass{
	InputFormPage inputformPage;
	@Test
	public void VerifyInputFormPage()
	{
		inputformPage=new InputFormPage(driver);
		inputformPage.click_On_InputForm();   //click_On_InputForm is the method name in the inputformpage
	}
	@Test
	
public void VerifyEnterMsgField()
{
		
		inputformPage.EnterMsgField("harsha"); 
}

	
	
	
	

}
