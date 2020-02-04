package inetBankingv1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver ldriver;
 public Loginpage(WebDriver rdriver){
	 ldriver=  rdriver;
	 PageFactory.initElements(rdriver, this);
	 }
	@FindBy(name="uid") WebElement txtusername;
	@FindBy(name="password") WebElement txtpassword;
	@FindBy(name="btnLogin")WebElement BtnLogin;
	
	
	public void Setusername(String uname){
		txtusername.sendKeys(uname);
	}
	public void Setpassword(String pwd){
		txtpassword.sendKeys(pwd);
	}
	public void Clicksubmit(){
		BtnLogin.click();
	}
	

}
