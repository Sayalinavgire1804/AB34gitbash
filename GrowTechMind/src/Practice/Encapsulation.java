package Practice;

class Authentication {

	private String username = "google@gmail.com";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String password = "123";
	private int age = 56;
}

public class Encapsulation {

	public static void main(String[] args) {
		Authentication a1 = new Authentication();
		a1.setUsername("sayali@gmail.com");
		a1.setPassword("1234@sayali");
		a1.setAge(28);
		System.out.println(a1.getUsername());
		System.out.println(a1.getPassword());
		System.out.println(a1.getAge());
	}

}
