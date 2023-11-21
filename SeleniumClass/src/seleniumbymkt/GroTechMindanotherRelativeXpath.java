package seleniumbymkt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTechMindanotherRelativeXpath {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement Uname=driver.findElement(By.xpath("//input[@id='1']"));
		Uname.sendKeys("navgiresayali030@gmail.com");
		//WebElement Hint=driver.findElement(By.xpath("//input[@id='2']"));
		//Hint.sendKeys("1804");
		WebElement Pw=driver.findElement(By.xpath("//input[@name='Password']"));
		Pw.sendKeys("Sayali@1804");
		WebElement Fname=driver.findElement(By.xpath("//input[@name='text-397']"));
		Fname.sendKeys("Sayali");
		WebElement Lname=driver.findElement(By.xpath("//input[@id='5']"));
		Lname.sendKeys("Navgire");
		WebElement gender=driver.findElement(By.xpath("(//input)[25]"));
		gender.click();
		WebElement relocate=driver.findElement(By.xpath("//input[@name='checkbox-833[]']"));
		relocate.click();
		WebElement Religion=driver.findElement(By.xpath("//select"));
		Select s1=new Select(Religion);
		s1.selectByIndex(1);
		WebElement upload=	driver.findElement(By.xpath("//input[@name='file-935']"));
		upload.sendKeys("C:\\Users\\Sayali\\Downloads\\GroTechMinds File Upload pdf.pdf");
		
		
	}

}
