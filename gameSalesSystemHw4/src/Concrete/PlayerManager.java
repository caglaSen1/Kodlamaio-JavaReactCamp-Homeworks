package Concrete;

import Abstract.Logger;
import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Player;
import Utils.Utils;

public class PlayerManager implements PlayerService {
	private Logger[] loggers;
	private PlayerCheckService playerCheckService;

	public PlayerManager(Logger[] loggers, PlayerCheckService playerCheckService) {
		this.loggers = loggers;
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if (playerCheckService.checkIfRealPerson(player)) {
			System.out.println("Player added : " + player.getFirstName());
			Utils.runLoggers(loggers, player.getFirstName());
		}else {
			System.out.println("Not a valid person!");
		}

	}

	@Override
	public void delete(Player player) {
		if (playerCheckService.checkIfRealPerson(player)) {
			System.out.println("Player deleted : " + player.getFirstName());
			Utils.runLoggers(loggers, player.getFirstName());
		}else {
			System.out.println("Not a valid person!");
		}
	}

	@Override
	public void update(Player player) {
		if (playerCheckService.checkIfRealPerson(player)) {
			System.out.println("Player updated : " + player.getFirstName());
			Utils.runLoggers(loggers, player.getFirstName());
		}else {
			System.out.println("Not a valid person!");
		}
	}

}
