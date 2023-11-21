package seleniumbymkt;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuiet {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://youtube.com");
		//driver.close();
		driver.quit();
	}

}
