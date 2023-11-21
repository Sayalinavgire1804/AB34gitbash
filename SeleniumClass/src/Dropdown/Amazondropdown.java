package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazondropdown {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement appliance=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(appliance);
		//s1.selectByValue("search-alias=furniture");
		//s1.selectByIndex(11);
		s1.selectByVisibleText("Health & Personal Care");
		/*List<WebElement> options=s1.getOptions();
		int count=options.size();
		System.out.println(count);*/
		List<WebElement> list=s1.getOptions();
		int count=list.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement option=list.get(i);
			String a=option.getText();
			System.out.println(a);
			
			
		}
		
		
	}

}
