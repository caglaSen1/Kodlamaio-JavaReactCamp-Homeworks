package homework2;

public class User {
	private int id;
	private String userName;
	private int password;

	public User() {

	}

	public User(int id, String userName, int password) {
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
}
