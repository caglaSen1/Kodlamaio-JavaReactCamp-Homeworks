package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface DiscoutService {
	void applied(Game game, Campaign campaign);

}
