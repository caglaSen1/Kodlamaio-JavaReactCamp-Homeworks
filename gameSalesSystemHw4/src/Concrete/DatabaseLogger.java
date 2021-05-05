package Concrete;

import Abstract.Logger;
import Entities.Gamer;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Logged to db : " + message);
		
	}

}
