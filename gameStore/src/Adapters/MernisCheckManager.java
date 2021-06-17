package Adapters;

import Abstract.CustomerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		try {
			return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.valueOf(gamer.getNationalityId()),
					gamer.getFirstName(), gamer.getLastName(), gamer.getDateOfBirth().getYear());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
