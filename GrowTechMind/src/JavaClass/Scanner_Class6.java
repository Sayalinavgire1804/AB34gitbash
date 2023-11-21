package JavaClass;

import java.util.Scanner;

public class Scanner_Class6 {
	static void addition()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Value of a");
		int a=s1.nextInt();
		System.out.println("Enter Value of b");
		int b=s1.nextInt();
		int c=a+b;
		System.out.println("Your Output is:"+c);
		
		//s1.close();
		
	}
	static void subtraction()
	{
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter Value of a");
		int a=s2.nextInt();
		System.out.println("Enter Value of b");
		int b=s2.nextInt();
		int c=a-b;
		System.out.println("Your Output is:"+c);
		//s2.close();
		
		
	}
	static void multiplication()
	{
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter Value of a");
		int a=s3.nextInt();
		System.out.println("Enter Value of b");
		int b=s3.nextInt();
		int c=a*b;
		System.out.println("Your Output is:"+c);
		//s3.close();
		
	}
	static void division()
	{
		Scanner s4=new Scanner(System.in);
		System.out.println("Enter Value of a");
		int a=s4.nextInt();
		System.out.println("Enter Value of b");
		int b=s4.nextInt();
		int c=a/b;
		System.out.println("Your Output is:"+c);
		//s4.close();
	}
	public static void main(String[] args) {
		addition();
		subtraction();
		division();
		multiplication();
		
	}

}
