package PaymentOption;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class DTDGetuid {
	WebDriver driver;
	static Workbook wb;
	static FileInputStream fs;
	static String uname;
	static String password;
	
	public static void getcredentials() throws EncryptedDocumentException, IOException
	{
		fs=new FileInputStream("C:\\Users\\Sayali\\eclipse-workspace\\GroTechmindClass\\ExcelSheet\\Sayaliexcel.xlsx");
		wb=WorkbookFactory.create(fs);
		uname=wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		password=wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		
		
	}
	

}
