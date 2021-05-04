package Concrete;

import Abstract.DiscoutService;
import Entities.Campaign;
import Entities.Game;

public class DiscountManager implements DiscoutService{

	@Override
	public void applied(Game game, Campaign campaign) {
		System.out.println("Discounted game price : " + (game.getPrice()-(game.getPrice()*campaign.getDiscount()/100)));
		
	}

}
