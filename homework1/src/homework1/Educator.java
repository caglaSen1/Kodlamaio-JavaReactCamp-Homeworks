package homework1;

public class Educator {

	// data fields/attributes
	int id;
	String firstName;
	String lastName;
	
	// constructor
	public Educator() {
		System.out.println("Ben çalýþtým");
	}
	
	// parametreli constructor
	public Educator(int id, String firstName, String lastName) {     
		this();                             //Parametresiz constructorýn da çalýþmasý için this() yazdým. 
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
