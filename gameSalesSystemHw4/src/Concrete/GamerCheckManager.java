package Concrete;

import Abstract.GamerCheckSerivce;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckSerivce {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {

		return true;
	}

}
