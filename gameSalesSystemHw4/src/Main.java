import java.time.LocalDate;

import Abstract.Logger;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.DatabaseLogger;
import Concrete.EmailLogger;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer(1, "Çaðla", "Þen", "38996140066", 2001);
		Game game1 = new Game(1, "X GAME", 50);
		Game game2 = new Game(2, "Y GAME", 45);
		Campaign campaign1 = new Campaign(1, "NEW REGISTRATION DISCOUNT", 30);
		Campaign campaign2 = new Campaign(2, "10% DISCOUNT ON ALL PRODUCTS", 15);

		Logger[] loggers = { new EmailLogger(), new DatabaseLogger() };

		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter(), loggers);
		CampaignManager campaignManager = new CampaignManager();
		GameManager gameManager = new GameManager(loggers);

		System.out.println("--------ADDING/DELETING A CAMPAIGN----------");
		campaignManager.add(campaign1);
		System.out.println("------");
		campaignManager.delete(campaign2);

		System.out.println("\n--------REGISTERING/DELETING A GAMER----------");
		gamerManager.register(gamer1);
		System.out.println("------");
		gamerManager.delete(gamer1);

		System.out.println("\n-----SALE OF GAMES WITH/WITHOUT CAMPAIGN------");
		gameManager.sell(game1, gamer1, campaign1);
		System.out.println("------");
		gameManager.sell(game2, gamer1);

		System.out.println("\n-----UPDATING GAMER------");
		gamerManager.update(gamer1);

		System.out.println("\n-----UPDATING CAMPAIGN------");
		campaignManager.update(campaign2);

	}

}
