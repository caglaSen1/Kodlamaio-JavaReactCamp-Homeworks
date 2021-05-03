package homework1;

public class Main {

	public static void main(String[] args) {

		// referans oluþturma, instance
		Course course1 = new Course(1, "JAVA + REACT", "2 aylýk kamp");
		Course course2 = new Course(2, "C# + ANGULAR", "2 aylýk kamp");
		Course course3 = new Course(3, "Temel Kurs", "Programlamaya giriþ kursu");
		Educator educator1 = new Educator(1, "Engin", "Demiroð");
		
		Course[] courses = {course1, course2, course3}; 
	
		for(Course course : courses) {   // veri tipi Course, courses arrayini gezer, o ankine course diye bir takma isim verir
			System.out.println(course.name);
		}
		
		Educator[] educators = {educator1};
		
		for(Educator educator : educators) {
			System.out.println(educator.firstName + " " + educator.lastName);
		}
		
	    CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course2);
		courseManager.delete(course3);
		
	
	}
	

}

