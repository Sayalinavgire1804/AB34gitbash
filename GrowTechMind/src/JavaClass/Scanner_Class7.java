package JavaClass;

import java.util.Scanner;

public class Scanner_Class7 {

	public static void main(String[] args) {

		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		int c=a+b;
		System.out.println("Your output is:");
		System.out.println(c);
		//System.out.println("Your output is:"+c);
		s1.close();
	}

}
