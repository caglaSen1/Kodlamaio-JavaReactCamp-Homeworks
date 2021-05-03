package homework1;

public class Course {

	// data fields/attributes
	int id;
	String name;
	String detail;
	
	// constructor
	public Course() {
		System.out.println("Ben çalýþtým");
	}
	
	// parametreli constructor
	public Course(int id, String name, String detail) {      
		this();                                         //Parametresiz constructorýn da çalýþmasý için this() yazdým.
		this.id = id;             
		this.name = name;
		this.detail= detail;
	}
}
