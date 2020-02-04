package inetBankingv1.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;



import inetBankingv1.pageobjects.AddnewCustomer;
import inetBankingv1.pageobjects.Loginpage;

public class Newcustomertestcase extends BaseClass {
	
	@Test
	public void Newcustomertest() throws InterruptedException{
		
		Loginpage Lp = new Loginpage(driver);
		driver.get(baseURl);
		driver.manage().window().maximize();
		Lp.Setusername(username);
		Lp.Setpassword(password);
		Lp.Clicksubmit();
		Thread.sleep(3000);
String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Guru99 Bank Manager HomePage")){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertTrue(false);
		}	
		
		AddnewCustomer AddCus = new AddnewCustomer(driver);
		AddCus.clickNewcustomer();
		AddCus.EnterName("srilakshmi");
		AddCus.clickGender();
		AddCus.Enterdob ("10", "12", "1981");
		AddCus.EnterAddress("INDIA");
		AddCus.EnterCity("geaorgia");
		AddCus.EnterState("florida");
		AddCus.Enterpinno("521201");
		AddCus.Phonenumber("5232145225");
		AddCus.EnterEmailid(randomString()+"@Gmail.com");
		AddCus.enterpassword("gfhy21");
		AddCus.clicksubmit();
		Thread.sleep(6000);
		String source = driver.getPageSource();
		if(source.contains("Customer Registered Successfully!!!")){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertTrue(false);
		}
		
	}
	public static String randomString(){
		
		String AlphanumericString="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"
				+"abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder(8);
		for(int i=0;i<8;i++){
			int index=(int)(AlphanumericString.length()*Math.random());
			sb.append(AlphanumericString 
                    .charAt(index)); 
  } 

  return sb.toString(); 
		}
	}
	
	
	
	
	
	
	
	


