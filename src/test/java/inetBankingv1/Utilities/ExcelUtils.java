package inetBankingv1.Utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
public	static XSSFWorkbook wb1;
	public ExcelUtils(String excelpath){
	
	try{
	File fpath = new File(excelpath);
		FileInputStream finput = new FileInputStream(fpath);
		 wb1 = new XSSFWorkbook(finput);
		
		
	}
catch(Exception e1){
	
}
	}


public  String getcelldata(int sheetnum,int rows,int col){
	
	String data = wb1.getSheetAt(sheetnum).getRow(rows).getCell(col).toString();
	return data;
	
}
public static   int getrowcount(int sheetnum){
	int rowcount = wb1.getSheetAt(sheetnum).getLastRowNum()+1;
	return rowcount;
}
}	


	
	


