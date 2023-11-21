package Selenium.GroTechmindClass;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AmazonLimksCount {
	@Test
	public void scenario1() throws IOException
	{
		int valindlinkcount=0;
		int invalidlink=0;
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int linkcount=links.size();
		System.out.println(linkcount);
		for(int i=0;i<linkcount;i++)
			
		{
			WebElement link1=links.get(i);//get links which is present at particular index
			String url=link1.getAttribute("href");//get the links
			try {
			URL u1=new URL(url);
			HttpURLConnection rv=(HttpURLConnection)u1.openConnection();//Upcasting to utilize methods of HttpURLConnection
			rv.connect();
			if(rv.getResponseCode()==200)
			{

				valindlinkcount++;
			}
			else
			{
				invalidlink++;

				
			}
			

			}
			
			catch(MalformedURLException a1)
			{
				System.out.println("I am MalformedURLException exception");
			}
			catch(NullPointerException a2)
			{
				System.out.println("I am NullPointerException exception");
			}
			System.out.println(valindlinkcount);
			System.out.println(invalidlink);
			
		
			
		}
		
	}

}
