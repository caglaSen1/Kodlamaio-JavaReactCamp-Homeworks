package Concrete;

import Abstract.CampaignService;
import Abstract.Logger;
import Entities.Campaign;
import Entities.Player;
import Utils.Utils;

public class CampaignManager implements CampaignService {
	private Logger[] loggers;
	
	public CampaignManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	@Override
	public void add(Campaign campaign, Player player) {
		System.out.println("Campaign added : " + campaign.getName() + "- " + player.getFirstName());
		Utils.runLoggers(loggers, player.getFirstName());

	}

	@Override
	public void delete(Campaign campaign, Player player) {
		System.out.println("Campaign deleted : " + campaign.getName() + "- " + player.getFirstName());
		Utils.runLoggers(loggers, player.getFirstName());
	}

	@Override
	public void update(Campaign campaign, Player player) {
		System.out.println("Campaign updated : " + campaign.getName() + "- " + player.getFirstName());
		Utils.runLoggers(loggers, player.getFirstName());
	}

}
