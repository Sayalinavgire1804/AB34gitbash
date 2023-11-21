package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazondropdpwn1 {


	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sayali/Documents/sayali.html");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.tagName("select"));
		Select s1=new Select(dropdown);
		s1.selectByVisibleText("Relegion 3");
		List<WebElement> options=s1.getOptions();//getting number of options
		int count=options.size();
		System.out.println(count);
		
	}
	
}
