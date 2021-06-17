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
			System.out.println(gamer.getUserName() + " adlý kullanýcý sisteme üye oldu.");
		} else {
			System.out.println("Not a valid person");
		}
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		if (this.customerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getUserName() + " adlý kullancýnýn üyeliði iptal edildi.");
		} else {
			System.out.println("Not a valid person");
		}

		
	}

	@Override
	public void update(Gamer gamer) {
		if (this.customerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getUserName() + " adlý kullanýcýnýn userName i deðiþtirildi.");
		} else {
			System.out.println("Not a valid person");
		}		
		
	}

}
