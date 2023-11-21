package JavaPopups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildpopup1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=EAIaIQobChMI5fue0ZiegQMVoqRmAh0_TAWPEAAYASAAEgLd4vD_BwE&gclsrc=aw.ds");
		WebElement google=driver.findElement(By.xpath("//button[@name='google-register']"));
		google.click();
		Set<String> parentchild=driver.getWindowHandles();
		Iterator<String> parentchild1=parentchild.iterator();
		String parent=parentchild1.next();
		String Child=parentchild1.next();
		driver.switchTo().window(Child);
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parent);
		
	}

}
