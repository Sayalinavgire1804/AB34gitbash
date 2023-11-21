package Selenium.GroTechmindClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

public class URL_Class {
	@Test
	public void method1() throws MalformedURLException
	{
		URL u1=new URL("https://google.com");
		System.out.println(u1.getPort());
		System.out.println(u1.getProtocol());
		System.out.println(u1.getPath());
		
		
		
	}

}
