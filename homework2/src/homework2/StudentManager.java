package homework2;

public class StudentManager extends UserManager {
	public void logIn(Student student) {
		System.out.println(
				"Kullanýcý adý: " + student.getUserName() + " Þifre: " + student.getPassword() + " - giriþ yapýldý");
	}
}
