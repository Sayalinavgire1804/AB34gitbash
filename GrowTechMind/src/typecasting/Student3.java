package typecasting;

class Principal {

	void Observation() {

		System.out.println("Observation");

	}

	void Monitor() {
		System.out.println("Monitor");
	}
}

class Teacher3 extends Principal {
	void Maths() {

		System.out.println("Maths");

	}

	void Algebra() {
		System.out.println("Algebra");
	}

}

class Mentor3 extends Teacher3 {
	void Hindi() {
		System.out.println("Hindi");

	}

	void English() {
		System.out.println("English");

	}

}

public class Student3 extends Mentor3 {
	void Lesson() {
		System.out.println("Lesson");

	}

	void Assignment() {
		System.out.println("Assignment");

	}

	public static void main(String[] args) {
		
		Teacher3 t1=new Mentor3();//upcasting
		t1.Observation();
		t1.Monitor();
		t1.Algebra();
		t1.Maths();
		
Mentor3 m1=new Student3();//upcasting
m1.Observation();
m1.Monitor();
m1.Algebra();
m1.Maths();
m1.English();
m1.Hindi();
Student3 s1=(Student3) m1;//downcasting
s1.Observation();
s1.Monitor();
s1.Algebra();
s1.Maths();
s1.English();
s1.Hindi();
s1.Assignment();
s1.Lesson();
	}

}
