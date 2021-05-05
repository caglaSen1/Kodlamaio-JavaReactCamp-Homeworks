package Concrete;

import Abstract.Logger;
import Entities.Gamer;

public class EmailLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Email sended to : " + message);
		
	}

}
