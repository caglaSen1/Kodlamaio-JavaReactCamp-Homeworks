package Abstract;

import Entities.Campaign;
import Entities.Player;

public interface CampaignService {
	void add(Campaign campaign, Player player);
	void delete(Campaign campaign, Player player);
	void update(Campaign campaign, Player player);

}
