package inetBankingv1.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import inetBankingv1.Utilities.ExcelUtils;
import inetBankingv1.pageobjects.Loginpage;



public class Tc_LoginDDT_002 extends BaseClass{
	@Test (dataProvider="login")
	public void LoginDDT(String username,String password){
		
		 logger=extent.createTest("Verify login page");
		 logger.log(Status.INFO, "Entered base url");
		 driver.get(baseURl);	
			
			 Loginpage Lp = new Loginpage(driver);
			 Lp.Setusername(username);
			
				Lp.Setpassword(password);
				
				Lp.Clicksubmit();
				String title = driver.getTitle();
				System.out.println(title);
				 if(driver.getTitle().contains("Guru99 Bank Manager HomePage")){
						Assert.assertTrue(true);
				
				 }
				 else{
					 Assert.assertTrue(false);
				 }
				
	}
	
	
	
	
	
	
	public boolean alertispresent(){
					try{
					driver.switchTo().alert();
					return true;
					}
					catch(Exception e){
						return false;
						
					}
	
	
	
	}


	@DataProvider(name="login")
	public Object[][] logindata(){
		
		 ExcelUtils xl = new ExcelUtils("./src/test/java/inetBankingv1/Testdata/Book1.xlsx");
		int rcount = ExcelUtils.getrowcount(0);
		
		Object[][] data = new Object[rcount][2];
		
	for(int i=0;i<rcount;i++){
		data[i][0]=xl.getcelldata(0, i, 0);
		data[i][1]=xl.getcelldata(0, i, 1);
		
		
	}
	return data;
		
	}
		
	}
		
		
		
		



