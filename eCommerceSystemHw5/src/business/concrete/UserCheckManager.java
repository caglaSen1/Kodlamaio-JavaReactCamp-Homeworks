package business.concrete;

import java.util.regex.Pattern;

import business.abstracts.UserCheckService;
import core.abstracts.AuthService;
import core.abstracts.EmailService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserCheckManager implements UserCheckService {

	private AuthService authService;

	public UserCheckManager() {

	}

	public UserCheckManager(AuthService authService) {
		this.authService = authService;

	}

	@Override
	public boolean isValidFirstName(String firstName) {
		if (firstName.length() >= 2) {
			return true;
		} else {
			System.out.println("Your first name can't be less than 2 character.");
			return false;
		}

	}

	@Override
	public boolean isValidLastName(String lastName) {
		if (lastName.length() >= 2) {
			return true;
		} else {
			System.out.println("Your last name can't be less than 2 character.");
			return false;
		}
	}

	@Override
	public boolean isValidPassword(String password) {
		if (password.length() >= 6) {
			return true;
		} else {
			System.out.println("Your password can't be less than 6 character.");
			return false;
		}

	}

	@Override
	public boolean isValidEmail(String email) {
		String emailRegex = "^\\w+(\\.\\w+)*@[a-zA-Z]+(\\.\\w{2,6})+$";
		Pattern pattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
		if (email == null) {
			System.out.println("Wrong email format!");
			return false;
		} else if (!pattern.matcher(email).matches()) {
			System.out.println("Wrong email format!");
			return false;
		}
		return true;
	}

	@Override
	public boolean isUsedEmail(String email, UserDao userDao) {
		if (userDao.getByEmail(email) != null) {
			System.out.println("Email is used before.");
			return true;
		}
		return false;
	}

	@Override
	public boolean isValidUser(User user, UserDao userDao) {
		if (authService != null) {
			return authService.isValidUser();
		}
		if (!isValidFirstName(user.getFirstName())) {
			return false;
		} else if (!isValidLastName(user.getLastName())) {
			return false;
		} else if (!isValidPassword(user.getPassword())) {
			return false;
		} else if (!isValidEmail(user.getEmail())) {
			return false;
		} else {
			return (!isUsedEmail(user.getEmail(), userDao));
		}

	}

	@Override
	public boolean isCorrectLoginInput(String email, String password, UserDao userDao) {
		if (authService != null) {
			return authService.isValidUser();
		}
		User user = userDao.getByEmail(email);
		if (user == null) {
			System.out.println("Incorrect email!");
			return false;
		} else if (!user.getPassword().equals(password)) {
			System.out.println("Incorrect password!");
			return false;
		}
		return true;
	}

}
