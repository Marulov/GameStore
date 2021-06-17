package Concrate;

import Abstract.CustomerCheckService;
import Entities.Gamer;

public class MyCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		if (gamer.getNationalityId().length() == 11) {
			return true;
		}
		return false;
		
	}

}
