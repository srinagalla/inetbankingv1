package inetBankingv1.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import inetBankingv1.pageobjects.Loginpage;

public class TC_LoginTest_001 extends BaseClass{
	
	
	@Test
	
	public void loginTest(){
		
 logger=extent.createTest("Verify login page");
 logger.log(Status.INFO, "Entered base url");
		driver.get(baseURl);
	
	 Loginpage Lp = new Loginpage(driver);
	 Lp.Setusername(username);
	 logger.log(Status.INFO, "entered username");
		Lp.Setpassword(password);
		logger.log(Status.INFO, "entered password");
		Lp.Clicksubmit();
		
		 if(driver.getTitle().equalsIgnoreCase("guru99 home page")){
			Assert.assertTrue(true);
			logger.log(Status.PASS,"Login test passed");
			
			
		}
	} 
	

}
