package DataProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook_Login {
	@Test(dataProvider="logondetails")
	public void test1(String un, String password)
	{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://facebook.com");
		d1.manage().window().maximize();
		WebElement Uname=d1.findElement(By.xpath("(//input)[3]"));
		Uname.sendKeys(un);
		WebElement Pw=d1.findElement(By.xpath("(//input)[4]"));
		Pw.sendKeys(password);
		WebElement Login=d1.findElement(By.xpath("//button"));
		Login.click();
		
	}
	@DataProvider(name="logondetails")
	public Object[][] numbers()
	{

		Object data[][]=new Object[2][2];
		data[0][0]="ram@gmail.com";
		data[0][1]="ram@123";
		data[1][0]="sita@gmail.com";
		data[1][1]="sita@123";
		return data;
	}

}
