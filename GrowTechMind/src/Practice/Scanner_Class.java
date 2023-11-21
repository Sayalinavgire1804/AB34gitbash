package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		Scanner s2=new Scanner(System.in);

		try
		{
			int a=s2.nextInt();
			
			
		}
		catch(InputMismatchException a1)
		{
			
			System.out.println("I am handling the exception");
		}
		
		
		
	}

}
