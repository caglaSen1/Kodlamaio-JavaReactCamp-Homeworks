package homework2;

public class StudentManager extends UserManager {
	public void logIn(Student student) {
		System.out.println(
				"Kullan�c� ad�: " + student.getUserName() + " �ifre: " + student.getPassword() + " - giri� yap�ld�");
	}
}
