package Amazon_Source;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class File_class  {
	static FileInputStream fs;
	 static String uname;
	 static String password;
   ChromeDriver driver;
   static Workbook wb; 
   static String phone;

  public static void DTDMethod() throws EncryptedDocumentException, IOException  {
		 fs=new FileInputStream("C:\\Users\\Sayali\\eclipse-workspace\\PomAmazon\\ExcelSheet\\Sayaliexcel.xlsx");
		 wb=WorkbookFactory.create(fs);
		 uname=wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		 password=wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		 phone=NumberToTextConverter.toText(wb.getSheet("Login").getRow(2).getCell(0).getNumericCellValue());

		 
		
		
	}

}
