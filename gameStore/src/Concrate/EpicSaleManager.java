package Concrate;

import Abstract.SaleService;
import Entities.Game;
import Entities.Gamer;

public class EpicSaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println("Epic Store a hoþgeldiniz.");
		System.out.println(game.getName() + " adlý oyun " + gamer.getUserName() + " adlý kullanýcýya satýldý.");
		
	}

}
