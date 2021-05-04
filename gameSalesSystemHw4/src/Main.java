import Concrete.CampaignManager;
import Concrete.DatabaseLogger;
import Concrete.DiscountManager;
import Concrete.EmailLogger;
import Concrete.FileLogger;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

import java.time.LocalDate;

import Abstract.Logger;
import Adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) {

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new EmailLogger() };
		
		Player player1 = new Player(1, "Çaðla", "Þen", "Çaðla_Þen", "12345678910", LocalDate.of(2001, 5, 25));
		Game game1 = new Game(1, "VALORANT", 100);
		Campaign campaign1 = new Campaign(1, "YILIN KAMPANYASI", 50);
		
		PlayerManager playerManager = new PlayerManager(loggers, new MernisServiceAdapter()); //player can be added only if the data he/she entered is true
		playerManager.update(player1);

		GameManager gameManager = new GameManager(loggers);  
		gameManager.add(game1, player1);  // player can add a game

		CampaignManager campaignManager = new CampaignManager(loggers);
		campaignManager.add(campaign1, player1);   // player can add a campaign 
		
		DiscountManager discountManager = new DiscountManager();
		discountManager.applied(game1, campaign1);  // The discounted game price with the selected campaign
	}

}
