package Concrete;

import Abstract.Logger;

public class FileLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Logged to file : " + message);
		
	}

}
