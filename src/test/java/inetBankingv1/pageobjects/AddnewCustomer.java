package inetBankingv1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddnewCustomer {
	
	 WebDriver ldriver;
	public AddnewCustomer(WebDriver rdriver){
		ldriver=  rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="New Customer")WebElement Newcustomer;
	@FindBy(name="name")WebElement  Name;
	@FindBy(name="rad1")WebElement Gender;
	@FindBy(name="dob")WebElement DobMonth;
	@FindBy(name="addr")WebElement Address;
	@FindBy(name="city")WebElement City;
	@FindBy(name="state")WebElement state;
	@FindBy(name="pinno")WebElement  pincode;
	@FindBy(name="telephoneno")WebElement  phnumber;
	@FindBy(name="emailid")WebElement  Emailid;
	@FindBy(name="password")WebElement  password;
	@FindBy(name="sub")WebElement  Submit;
	
	public void clickNewcustomer(){
		Newcustomer.click();
		
	}
	
	public void EnterName(String uname){
		Name.sendKeys(uname);
	}
	public void  clickGender(){
		Gender.click();
	}
	public void Enterdob(String mm,String dd,String yy){
		DobMonth.sendKeys(mm);
		DobMonth.sendKeys(dd);
		DobMonth.sendKeys(yy);
		
	}
	public void EnterAddress(String caddress){
		Address.sendKeys(caddress);
	}
	public void EnterCity(String Ccity){
		City.sendKeys(Ccity);
	}
	public void EnterState(String Cstate){
		state.sendKeys(Cstate);
	}
	public void Enterpinno(String Cpincode){
		pincode.sendKeys(String.valueOf(Cpincode));
	}
	public void Phonenumber(String Cphnum){
		phnumber.sendKeys(Cphnum);	
		
	}
	public void EnterEmailid(String Cemail){
		Emailid.sendKeys(Cemail);
	}
	public void  enterpassword(String Cpass){
		 password.sendKeys(Cpass);
	}
	public void  clicksubmit(){
		Submit.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
