package JavaClass3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3 {

	public static void main(String[] args) {
		try {
Scanner sc1=new Scanner (System.in);
int a=sc1.nextInt();
int b=sc1.nextInt();
int c=a/b;
System.out.println(c);
sc1.close();
		}
		catch(ArithmeticException a)
		{
			
			System.out.println("Handled Arithmatic Exception");
		}
		catch(InputMismatchException b)
		{
			
			System.out.println("Handled InputMismatchException Exception");
		}
		
			catch (NullPointerException c)
		{
				System.out.println("Handled NullPointerException Exception");
		}
		finally {
			System.out.println("I am There");
		}

		
	}

}
