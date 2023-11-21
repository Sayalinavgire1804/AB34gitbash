package Practice;

import java.util.Scanner;

public class Scannerclass {
	public void add()
	{
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc1.nextInt();
		System.out.println("Enter the value of b");
		int b=sc1.nextInt();
		int c=a+b;
		System.out.println("Result is"+" "+c);
	}

	public void subtract()
	{
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the value of d");
		int d=sc2.nextInt();
		System.out.println("Enter the value of e");
		int e=sc2.nextInt();
		int f=d-e;
		System.out.println("Result is"+" "+f);
	}
	public void Multiply()
	{
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the value of d");
		int d=sc2.nextInt();
		System.out.println("Enter the value of e");
		int e=sc2.nextInt();
		int f=d*e;
		System.out.println("Result is"+" "+f);
	}
	public void divide()
	{
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the value of d");
		int d=sc2.nextInt();
		System.out.println("Enter the value of e");
		int e=sc2.nextInt();
		int f=d/e;
		System.out.println("Result is"+" "+f);
	}
	public static void main(String[] args) {
		
		Scannerclass a1=new Scannerclass();
		a1.add();
		a1.subtract();
		a1.Multiply();
		a1.divide();

	}

}
