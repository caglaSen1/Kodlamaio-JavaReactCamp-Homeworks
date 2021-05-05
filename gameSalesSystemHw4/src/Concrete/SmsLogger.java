package Concrete;

import Abstract.Logger;
import Entities.Gamer;

public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Sms sended to : " + message);
		
	}

}
