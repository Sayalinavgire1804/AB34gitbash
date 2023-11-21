package typecasting;

class Teacher2 {
	void Maths() {

		System.out.println("Maths");

	}

	void Algebra() {
		System.out.println("Algebra");
	}

}

class Mentor2 extends Teacher2 {
	void Hindi() {
		System.out.println("Hindi");

	}

	void English() {
		System.out.println("English");

	}

}

public class Student2 extends Mentor2 {
	void Lesson() {
		System.out.println("Lesson");

	}

	void Assignment() {
		System.out.println("Assignment");

	}
	public static void main(String[] args) {
		
		Teacher2 t1=new Mentor2();//upcasting
		t1.Algebra();
		t1.Maths();
		
		Mentor2 m1=(Mentor2) t1;//downcasting
		m1.Algebra();
		m1.Maths();
		m1.English();
		m1.Hindi();
	}

}
