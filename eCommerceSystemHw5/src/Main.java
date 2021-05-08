import business.concrete.UserCheckManager;
import business.concrete.UserManager;
import core.concretes.EmailManager;
import core.concretes.GoogleAuthManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User user1 = new User(1, "Çaðla", "Þen", "caglasenn36@gmail.com", "123456");
		User user2 = new User(2, "Engin", "Demiroð", "blabla73@hotmail.com", "836582");

		UserManager userManager1 = new UserManager(new HibernateUserDao(), new UserCheckManager(), new EmailManager());

		userManager1.register(user1);
		System.out.println("******************");

		userManager1.login(user1.getEmail(), user1.getPassword());
		System.out.println("******************");

		userManager1.delete(user1);
		System.out.println("******************");

		userManager1.update(user1);
		System.out.println("******************");

	}

}
