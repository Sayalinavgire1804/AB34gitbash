package PaymentOption;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;



public class Gtuid {
	
static FileInputStream fs;
static Workbook wb;
static String username;
static String password;

	
	
	
	@Test
	
	public static void scenario1() throws EncryptedDocumentException, IOException 
	{
		
		fs=new FileInputStream("C:\\Users\\Sayali\\eclipse-workspace\\GroTechmindClass\\ExcelSheet\\Sayaliexcel.xlsx");
		wb=WorkbookFactory.create(fs);
		username=wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		password=wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);
		System.out.println(password);
		
		
		
	}

}
