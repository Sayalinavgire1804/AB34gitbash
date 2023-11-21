package seleniumbymkt2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class Ticket {
	@Test
	public void travel() throws InterruptedException
	{
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.irctc.co.in/nget/train-search");
driver.manage().window().maximize();
WebElement from=driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
from.sendKeys("Banglore");
WebElement to=driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
to.sendKeys("NewDelhi");
WebElement datselect=driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
datselect.click();
 WebElement navigate= driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all ng-tns-c58-10 ng-star-inserted']"));
 navigate.click();
 WebElement date=driver.findElement(By.xpath("(//a[@class='ui-state-default ng-tns-c58-10 ng-star-inserted'])[31]"));
 date.click();
 WebElement dropdown =driver.findElement(By.xpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-12 pi pi-chevron-down']"));
 dropdown.click();
List<WebElement> cat=driver.findElements(By.xpath("(//div[@class='ui-dropdown-items-wrapper ng-tns-c65-12'])//ul/p-dropdownitem"));
int count=cat.size();
System.out.println(count);
Thread.sleep(3000);
cat.get(count-5).click();
WebElement search=driver.findElement(By.xpath("//button[@class='search_btn train_Search']"));
search.click();
 
		
	}
	

}
