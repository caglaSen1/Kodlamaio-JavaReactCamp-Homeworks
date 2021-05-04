package Concrete;

import Abstract.PlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements PlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		return true;
	}

}
