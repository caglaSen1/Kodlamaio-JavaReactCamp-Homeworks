package homework1;

public class Educator {

	// data fields/attributes
	int id;
	String firstName;
	String lastName;
	
	// constructor
	public Educator() {
		System.out.println("Ben �al��t�m");
	}
	
	// parametreli constructor
	public Educator(int id, String firstName, String lastName) {     
		this();                             //Parametresiz constructor�n da �al��mas� i�in this() yazd�m. 
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
