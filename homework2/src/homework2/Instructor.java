package homework2;

public class Instructor extends User {
	private String firstName;
	private String lastName;

	public Instructor() {

	}

	public Instructor(String firstName, String lastname) {
		this.firstName = firstName;
		this.lastName = lastname;
	}

	@Override
	public String getUserName() {
		return this.firstName + "_" + this.lastName + "." + getId();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
