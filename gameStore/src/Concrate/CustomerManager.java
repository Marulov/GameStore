package Concrate;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Gamer;

public class CustomerManager implements CustomerService {
	
	private CustomerCheckService customerCheckService;
	

	public CustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if (this.customerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getUserName() + " adl� kullan�c� sisteme �ye oldu.");
		} else {
			System.out.println("Not a valid person");
		}
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		if (this.customerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getUserName() + " adl� kullanc�n�n �yeli�i iptal edildi.");
		} else {
			System.out.println("Not a valid person");
		}

		
	}

	@Override
	public void update(Gamer gamer) {
		if (this.customerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getUserName() + " adl� kullan�c�n�n userName i de�i�tirildi.");
		} else {
			System.out.println("Not a valid person");
		}		
		
	}

}
