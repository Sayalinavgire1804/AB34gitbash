package PaymentOption;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreditCardPayment extends LaunchandQuite {
	
	@Test
	public void Payment() throws EncryptedDocumentException, IOException
	{
		getcredentials();
		
		WebElement accountandlist=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
		WebElement signin=driver.findElement(By.xpath("//span[.='Sign in']"));
		signin.click();
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys(uname);
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		WebElement pw=driver.findElement(By.name("password"));
		pw.sendKeys(password);
		WebElement signin1=driver.findElement(By.id("signInSubmit"));
		signin1.click();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		WebElement shoe=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		shoe.click();
		Set<String> parentchild=driver.getWindowHandles();
		Iterator<String> parentchild1= parentchild.iterator();
		String parent=parentchild1.next();
		String child=parentchild1.next();
		driver.switchTo().window(child);
		WebElement addtocart=driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		WebElement proceedtobuy=driver.findElement(By.name("proceedToRetailCheckout"));
		proceedtobuy.click();
		WebElement address=driver.findElement(By.id("shipToThisAddressButton"));
		address.click();
		WebElement creditcard=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[2]"));
		creditcard.click();
		WebElement clink=driver.findElement(By.xpath("(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]"));
		clink.click();
		WebElement frame1=driver.findElement(By.name("ApxSecureIframe"));
		driver.switchTo().frame(frame1);
		WebElement carnumber=driver.findElement(By.xpath("//input[@name='addCreditCardNumber']"));
		carnumber.sendKeys("5278506512345678");
		WebElement month=driver.findElement(By.name("ppw-expirationDate_month"));
		Select s1=new Select(month);
		s1.selectByVisibleText("09");
		WebElement year=driver.findElement(By.name("ppw-expirationDate_year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2031");
		
	}

}
