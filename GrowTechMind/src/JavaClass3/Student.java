package JavaClass3;
public class Student {
	int age;
	String name;
	double weight;
	Student(int age, String name,double weight)
	{
		this.age=age;
		this.name=name;
		this.weight=weight;
		
	}
	
	

	public static void main(String[] args) {
		Student s1=new Student(21,"RAM",65.78);
		System.out.println(s1.age);
		System.out.println(s1.name);
		System.out.println(s1.weight); 
		
		

		
	}

}
