package homework2;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý eklendi: " + user.getUserName());
	}

	public void multipleAdd(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
}
