package Abstract;

import Entities.Game;
import Entities.Player;

public interface GameService {
	void add(Game game, Player player);
	void delete(Game game, Player player);
	void update(Game game, Player player);
	

}
