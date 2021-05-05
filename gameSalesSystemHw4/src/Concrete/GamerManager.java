package Concrete;

import java.util.Scanner;

import Abstract.GamerCheckSerivce;
import Abstract.GamerService;
import Abstract.Logger;
import Entities.Gamer;
import Utils.Utils;

public class GamerManager implements GamerService {

	private GamerCheckSerivce gamerCheckService;
	private Logger[] loggers;

	public GamerManager(GamerCheckSerivce gamerCheckService, Logger[] loggers) {
		this.gamerCheckService = gamerCheckService;
		this.loggers = loggers;
	}

	@Override
	public void register(Gamer gamer) {

		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " registered to the system");
			Utils.runLoggers(loggers, gamer.getFirstName());
		} else {
			System.out.println("Not a valid person!");
		}

	}

	@Override
	public void update(Gamer gamer) {

		if (gamerCheckService.checkIfRealPerson(gamer)) {
			Scanner scan = new Scanner(System.in);

			System.out.print("Please enter the new first name : ");
			gamer.setFirstName(scan.nextLine());

			System.out.print("Please enter the new last name : ");
			gamer.setLastName(scan.nextLine());

			System.out.print("Please enter the new nationality id : ");
			gamer.setNationalityId(scan.nextLine());

			System.out.print("Please enter the new year of birth : ");
			gamer.setYearOfBirth(scan.nextInt());

			System.out.println("The gamer has been updated");

			Utils.runLoggers(loggers, gamer.getFirstName());
		} else {
			System.out.println("Not a valid person!");
		}

	}

	@Override
	public void delete(Gamer gamer) {

		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " deleted from the system");
			Utils.runLoggers(loggers, gamer.getFirstName());
		} else {
			System.out.println("Not a valid person!");
		}

	}
}
