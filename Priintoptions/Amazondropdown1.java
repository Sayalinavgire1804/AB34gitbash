package Priintoptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazondropdown1 {
	@Test
	public void scenario1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(dropdown);
		List<WebElement> amazonlists=s1.getOptions();
		int count=amazonlists.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			
			WebElement options=amazonlists.get(i);
			String a=options.getText();
			System.out.println(a);
			
		}
		
			
		}
	
}
