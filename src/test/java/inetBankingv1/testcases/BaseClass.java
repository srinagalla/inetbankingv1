package inetBankingv1.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import inetBankingv1.Utilities.Readconfig;

public class BaseClass {
Readconfig	readconfig = new Readconfig();
	
	public String baseURl= readconfig.getAplicationurl();
	public String username= readconfig.getUsername();
	public String password= readconfig.getpassword();
	public static WebDriver driver;
	
	ExtentHtmlReporter html;
	public ExtentReports extent;
	public static ExtentTest logger;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", readconfig.getpath());
	    driver= new ChromeDriver();
	    
		 html = new ExtentHtmlReporter("./Screenshots/reports/Automationreports.html");
		 extent = new ExtentReports();
		 extent.attachReporter(html);
	}
	@AfterMethod
	public void teardown(){
		driver.quit();
		extent.flush();
	}

}
