package core.concretes;

import core.abstracts.AuthService;
import googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {

	@Override
	public boolean isValidUser() {

		return new GoogleAuthManager().isValidUserByGoogle();
	}

}
