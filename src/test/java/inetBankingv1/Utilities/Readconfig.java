package inetBankingv1.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	File src ;
	Properties prop;
	FileInputStream fis;
	public Readconfig(){
		
		 src = new File("./inetbanking.properties/config.properties");
		 
	try{
	    fis = new FileInputStream(src);
	    prop =new Properties();
	    prop.load(fis);
		
			
		}	
		catch(Exception e){
		System.out.println("Exception is" +e.getMessage());	
		}
	}
	public String getAplicationurl(){
	String	Url=prop.getProperty("baseURl");
	return Url;
		
	}
	public String getUsername(){
		
		String name = prop.getProperty("username");
		return name;
		
	}
	public String getpassword(){
		String password = prop.getProperty("password");
		return password;
	}
	
	public String getpath(){
		String path = prop.getProperty("chromepath");
		return path;
	}
	
	
	}
	


