package Concrete;

import Abstract.GameSerivce;
import Abstract.Logger;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Utils.Utils;

public class GameManager implements GameSerivce {

	private Logger[] loggers;

	public GameManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	@Override
	public void sell(Game game, Gamer gamer) {
		System.out.println(game.getName() + " : " + game.getPrice() + "\n" + game.getName() + " has been sold to "
				+ gamer.getFirstName() + " for " + game.getPrice());
		Utils.runLoggers(loggers, gamer.getFirstName());

	}

	@Override
	public void sell(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName() + " : " + game.getPrice() + "\nCampaign " + campaign.getName()
				+ " has been implemented \n" + game.getName() + " has been sold to " + gamer.getFirstName() + " for "
				+ game.getPriceAfterDiscount(campaign));

		Utils.runLoggers(loggers, gamer.getFirstName());
	}

}
