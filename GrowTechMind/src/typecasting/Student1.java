package typecasting;

class Teacher1 {
	void Maths() {

		System.out.println("Maths");

	}

	void Algebra() {
		System.out.println("Algebra");
	}

}

class Mentor1 extends Teacher1 {
	void Hindi() {
		System.out.println("Hindi");

	}

	void English() {
		System.out.println("English");

	}

}

public class Student1 extends Mentor1 {
	void Lesson() {
		System.out.println("Lesson");

	}

	void Assignment() {
		System.out.println("Assignment");

	}

	public static void main(String[] args) {

		Mentor1 m1 = new Student1();//upcasting
		m1.Algebra();
		m1.Maths();
		m1.English();
		m1.Hindi();
		Student1 s1 = (Student1) m1;//downcasting
		s1.Algebra();
		s1.Maths();
		s1.English();
		s1.Hindi();
		s1.Assignment();
		s1.Lesson();
	}

}
