package seleniumbymkt;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	public static void main(String[] args) {

		EdgeDriver driver=new EdgeDriver();
		driver.get("https://google.com");
		String title=driver.getTitle();
		System.out.println(title);
	}

}
