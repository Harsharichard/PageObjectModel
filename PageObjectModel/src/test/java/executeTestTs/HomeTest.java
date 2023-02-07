package executeTestTs;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import pages.HomePage;


public class HomeTest extends BaseClass{
	HomePage homepage;
@Test
public void VerifyHomePageLogo()
{
	homepage=new HomePage(driver);
	//homepage.isLogoDisplayed();
	Assert.assertTrue(homepage.isLogoDisplayed());
	
}

}
