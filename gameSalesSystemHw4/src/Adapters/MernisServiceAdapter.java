package Adapters;

import Abstract.GamerCheckSerivce;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckSerivce {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoap mernisSerivce = new KPSPublicSoapProxy();
		boolean result = false;

		try {
			result = mernisSerivce.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),
					gamer.getYearOfBirth());
		} catch (Exception e) {
			System.out.println("Not a valid person!");
		}
		return result;
	}

}
