package seleniumbymkt2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Sayali/Documents/sayali.html");
	driver.manage().window().maximize();
	WebElement lname=driver.findElement(By.id("121"));
	
	WebElement fname=driver.findElement(By.name("fname"));
	boolean l1=lname.isDisplayed();
	boolean f=fname.isEnabled();
	boolean l=lname.isEnabled();
	System.out.println(l1);
	System.out.println(l);
	System.out.println(f);

	if(l==true)
	{
		lname.sendKeys("Navgire");
	}
	else
	{
		System.out.println("Element is disabled");
	}

}
	
}
