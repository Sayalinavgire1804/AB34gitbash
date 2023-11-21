package DataProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Grotechmind {
	@Test(dataProvider="logondetails")
	public void test1(String un, String password,String lastname,String Firstname,String Parentadd,String Permanentadd,String Pin)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement Uname=driver.findElement(By.xpath("//input[@id='1']"));
		Uname.sendKeys(un);
		WebElement Pw=driver.findElement(By.xpath("//input[@name='Password']"));
		Pw.sendKeys(password);
		WebElement Fname=driver.findElement(By.xpath("//input[@name='text-397']"));
		Fname.sendKeys(Firstname);
		WebElement Lname=driver.findElement(By.xpath("//input[@id='5']"));
		Lname.sendKeys(lastname);
		WebElement Paddress=driver.findElement(By.name("paddress"));
		Paddress.sendKeys(Parentadd);
		WebElement permanentaddress=driver.findElement(By.name("permanentaddress"));
		permanentaddress.sendKeys(Permanentadd);
		WebElement pincode=driver.findElement(By.name("pincode"));
		pincode.sendKeys(Pin);
	}
	@DataProvider(name="logondetails")
	public Object[][] numbers()
	{

		Object data[][]=new Object[10][7];
		data[0][0]="ram@gmail.com";
		data[0][1]="ram@123";
		data[0][2]="ram";
		data[0][3]="Marathe";
		data[0][4]="Pune";
		data[0][5]="Pune";
		data[0][6]="3456";
		data[1][0]="sita@gmail.com";
		data[1][1]="sita@123";
		data[1][2]="sita";
		data[1][3]="Patil";
		data[1][4]="Mumbai";
		data[1][5]="Mumbai";
		data[1][6]="3457";
		data[2][0]="rahul@gmail.com";
		data[2][1]="rahul@123";
		data[2][2]="rahul";
		data[2][3]="Naik";
		data[2][4]="Nashik";
		data[2][5]="Nashik";
		data[2][6]="3458";
		data[3][0]="sayali@gmail.com";
		data[3][1]="sayali@123";
		data[3][2]="sayali";
		data[3][3]="Navgire";
		data[3][4]="Nagpur";
		data[3][5]="Nagpur";
		data[3][6]="3459";
		data[4][0]="vaibhav@gmail.com";
		data[4][1]="vaibhav@123";
		data[4][2]="vaibhav";
		data[4][3]="Sharma";
		data[4][4]="Kothrud";
		data[4][5]="Kothrud";
		data[4][6]="34510";
		data[5][0]="anurag@gmail.com";
		data[5][1]="anurag@123";
		data[5][2]="anurag";
		data[5][3]="Varma";
		data[5][4]="Hadapsar";
		data[5][5]="Hadapsar";
		data[5][6]="34511";
		data[6][0]="ankit@gmail.com";
		data[6][1]="ankit@123";
		data[6][2]="ankit";
		data[6][3]="Mane";
		data[6][4]="Wakad";
		data[6][5]="Wakad";
		data[6][6]="34512";
		data[7][0]="rupal@gmail.com";
		data[7][1]="rupal@123";
		data[7][2]="rupal";
		data[7][3]="Tyagi";
		data[7][4]="Bhopal";
		data[7][5]="Bhopal";
		data[7][6]="34513";
		data[8][0]="supriya@gmail.com";
		data[8][1]="supriya@123";
		data[8][2]="supriya";
		data[8][3]="Sanas";
		data[8][4]="Jaipur";
		data[8][5]="Jaipur";
		data[8][6]="34514";
		data[9][0]="Mahesh@gmail.com";
		data[9][1]="Mahesh@123";
		data[9][2]="Mahesh";
		data[9][3]="Nagar";
		data[9][4]="Delhi";
		data[9][5]="Delhi";
		data[9][6]="34515";
		return data;
	}

}
