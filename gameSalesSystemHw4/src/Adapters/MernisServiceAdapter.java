package Adapters;

import Abstract.PlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		KPSPublicSoap mernisService = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = mernisService.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), 
					player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(), player.getDateOfBirth().getYear());
		}catch(Exception e){
			System.out.println("Not a valid person!");
		}
		
		return result;
	}

}
