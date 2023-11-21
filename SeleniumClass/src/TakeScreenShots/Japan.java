package TakeScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Japan extends LaunchandQuit {
	@Test
	public void Scenario4() throws IOException, InterruptedException
	{
	WebElement search= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	search.sendKeys("Japan");
	search.sendKeys(Keys.ENTER);
	//step 1:
	Thread.sleep(3000);

	TakesScreenshot ts=driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Sayali\\eclipse-workspace\\SeleniumClass\\src\\TestNG\\Screensots\\Sayali"+Math.random()+".png");
	FileUtils.copyFile(source, destination);
	}

}
