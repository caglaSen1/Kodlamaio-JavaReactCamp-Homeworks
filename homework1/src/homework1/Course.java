package homework1;

public class Course {

	// data fields/attributes
	int id;
	String name;
	String detail;
	
	// constructor
	public Course() {
		System.out.println("Ben �al��t�m");
	}
	
	// parametreli constructor
	public Course(int id, String name, String detail) {      
		this();                                         //Parametresiz constructor�n da �al��mas� i�in this() yazd�m.
		this.id = id;             
		this.name = name;
		this.detail= detail;
	}
}
