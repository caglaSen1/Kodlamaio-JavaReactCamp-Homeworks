package homework2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor("Engin", "Denmiroğ");
		instructor1.setId(1);

		Student student1 = new Student("Çağla", "Şen");
		student1.setPassword(12345);
		student1.setId(2);

		Student student2 = new Student("Eda", "Yücel");
		student2.setPassword(678954);
		student2.setId(3);

		UserManager userManager = new UserManager();
		// userManager.add(student1); ---> tekli ekleme

		User[] users = { instructor1, student1, student2 };
		userManager.multipleAdd(users);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor1);

		StudentManager studentManager = new StudentManager();
		studentManager.logIn(student1);

	}
}