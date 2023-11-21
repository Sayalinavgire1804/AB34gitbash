package typecasting;

class Teacher
{
	 void Maths()
	{
		
		System.out.println("Maths");
		
	}
	void  Algebra()
	{
		System.out.println("Algebra");
	}
	
}
class Mentor extends Teacher
{
	 void Hindi()
	{
		System.out.println("Hindi");

	}
	void English()
	{
		System.out.println("English");

	}
}

public class Student extends Mentor {
	 void Lesson()
	{
		System.out.println("Lesson");

	}
	void Assignment()
	{
		System.out.println("Assignment");

	}

	public static void main(String[] args) {

		Teacher t1=new Student();//upcasting
		t1.Algebra();
		t1.Maths();
		Student s1=(Student)t1;//downcasting
		s1.Algebra();
		s1.Maths();
		s1.English();
		s1.Hindi();
		s1.Assignment();
		s1.Lesson();
		

}

}
