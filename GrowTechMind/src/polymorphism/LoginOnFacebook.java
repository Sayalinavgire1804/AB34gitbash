package polymorphism;

class AuthenticationLog {
	private String Username = "growtechmind@gmail.com";
	private String Password = "123";
	private int age = 22;

	public String getUsername() {
		return Username;
	}

	public String getPassword() {
		return Password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	public void setUsername(String username) {
		this.Username = username;
	}

}

public class LoginOnFacebook {

	public static void main(String[] args) {
		AuthenticationLog a2=new AuthenticationLog();
		a2.setUsername("sayali@gmail.com");
		a2.setPassword("6790233");
		a2.setAge(34);
		System.out.println(a2.getUsername());
		System.out.println(a2.getPassword());
		System.out.println(a2.getAge());
		

		
	}

}
