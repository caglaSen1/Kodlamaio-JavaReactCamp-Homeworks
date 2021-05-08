package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {

	void add(User user);

	void update(User user, User oldUser);

	void delete(User user);

	User getById(int id);

	User getByEmail(String email);

	List<User> getAll();

}
