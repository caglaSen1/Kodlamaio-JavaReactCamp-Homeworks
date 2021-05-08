package core.concretes;

import core.abstracts.EmailService;

public class EmailManager implements EmailService {

	@Override
	public void sendVerificationMail(String email) {
		System.out.println("Verification mail has send to " + email);
		System.out.println("Please verify your email from that link: https://verificationofemail.com/");

	}

}
