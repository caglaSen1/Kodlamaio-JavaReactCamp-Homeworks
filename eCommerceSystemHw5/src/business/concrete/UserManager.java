package business.concrete;

import business.abstracts.UserCheckService;
import business.abstracts.UserService;
import core.abstracts.EmailService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private UserCheckService userCheckService;
	private EmailService emailService;

	public UserManager(UserDao userDao, UserCheckService userCheckService, EmailService emailService) {
		this.userDao = userDao;
		this.userCheckService = userCheckService;
		this.emailService = emailService;
	}

	@Override
	public void register(User user) {
		if (userCheckService.isValidUser(user, userDao)) {
			emailService.sendVerificationMail(user.getEmail());
			System.out.println("Your email has been verified");
			System.out.println("Registration has been successfully completed");
			userDao.add(user);
			return;
		}
		System.out.println("Registration could not be completed");
	}

	@Override
	public void login(String email, String password) {
		if (userCheckService.isCorrectLoginInput(email, password, userDao)) {
			System.out.println("User loged in");
			return;
		}
		System.out.println("Login failed");
	}

	@Override
	public void update(User user) {
		if (userCheckService.isValidUser(user, userDao)) {
			User oldUser = userDao.getById(user.getId());
			if (oldUser == null) {
				System.out.println("Update failed: There isn't such a user!");
				return;
			}
			userDao.update(user, oldUser);
			if (!oldUser.getEmail().equals(user.getEmail())) {
				emailService.sendVerificationMail(user.getEmail());
				System.out.println("Your email has been verified");
			}
			System.out.println("User updated successfully");
			return;
		}
		System.out.println("Update failed");
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		System.out.println("User deleted successfully");
	}

}
