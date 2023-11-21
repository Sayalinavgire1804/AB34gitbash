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

public class AmazonLinks {
	@Test
	public void scenario() throws InterruptedException, IOException
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		Thread.sleep(5000);
		int linkacount=links.size();
		System.out.println(linkacount);
		for(int a=0; a<linkacount;a++)
		{
			
			WebElement links1=links.get(a);
			String url=links1.getAttribute("href");
			//System.out.println(url);
			toverifylinkisvalid(url);
			
		}
	}
	public static void toverifylinkisvalid(String url) throws IOException
	{
			try
			{
			URL u1=new URL(url);
			HttpURLConnection rv=(HttpURLConnection)u1.openConnection();
			rv.connect();
			
			if(rv.getResponseCode()==200)
			{
				System.out.println(url+" "+ "It is valid link"+" "+rv.getResponseCode()+rv.getResponseMessage());
			}
			else
			{
				System.out.println(url+" "+ "It is invalid link"+" "+rv.getResponseCode()+rv.getResponseMessage());
				
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
			
		}
	

}

