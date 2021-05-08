package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<User> usersInDatabase = new ArrayList<>();

	@Override
	public void add(User user) {
		System.out.println("Added to db by hibernate: " + user.getEmail());
		usersInDatabase.add(user);

	}

	@Override
	public void update(User user, User oldUser) {
		usersInDatabase.remove(oldUser);
		usersInDatabase.add(user);
		System.out.println("Updated in db by hibernate: " + user.getEmail());
	}

	@Override
	public void delete(User user) {
		System.out.println("Deleted in db by hibernate: " + user.getEmail());
		usersInDatabase.remove(getById(user.getId()));

	}

	@Override
	public User getById(int id) {
		List<User> users = getAll();
		if (users != null) {
			for (User user : users) {
				if (user.getId() == id)
					return user;
			}
		}
		return null;
	}

	@Override
	public User getByEmail(String email) {
		List<User> users = getAll();
		if (users != null) {
			for (User user : users) {
				if (user.getEmail().equals(email))
					return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return usersInDatabase;
	}

}
