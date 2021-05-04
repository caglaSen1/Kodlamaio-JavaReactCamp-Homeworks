package Concrete;

import Abstract.GameService;
import Abstract.Logger;
import Entities.Game;
import Entities.Player;
import Utils.Utils;

public class GameManager implements GameService {
	private Logger[]loggers;
	
	public GameManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	@Override
	public void add(Game game, Player player) {
		System.out.println("Game added : " + game.getName() + "- " + player.getFirstName());
		Utils.runLoggers(loggers, player.getFirstName());
	}

	@Override
	public void delete(Game game, Player player) {
		System.out.println("Game deleted : " + game.getName() + "- " + player.getFirstName());
		Utils.runLoggers(loggers, player.getFirstName());
	}

	@Override
	public void update(Game game, Player player) {
		System.out.println("Game updated : " + game.getName() + "- " + player.getFirstName());
		Utils.runLoggers(loggers, player.getFirstName());
	}

}
