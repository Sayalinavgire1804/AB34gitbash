package Selenium.GroTechmindClass;

import java.util.Scanner;

public class Assertkeyword {
	public static void main(String[] args) {
		
	
	Scanner s1=new Scanner(System.in);
	int age=s1.nextInt();
	//assert age>18;//syntax 1
	assert age>18 :"Age is less";
	
			
	}
	
}
