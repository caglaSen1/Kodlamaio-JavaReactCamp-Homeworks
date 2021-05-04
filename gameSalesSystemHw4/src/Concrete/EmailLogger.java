package Concrete;

import Abstract.Logger;

public class EmailLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Email sended : " + message);
		
	}

}
