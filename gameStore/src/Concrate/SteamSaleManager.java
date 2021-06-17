package Concrate;

import Abstract.SaleService;
import Entities.Game;
import Entities.Gamer;

public class SteamSaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println("Steam e ho�geldiniz.");
		System.out.println(game.getName() + " adl� oyun " + gamer.getUserName() + " adl� kullan�c�ya sat�ld�.");
		
	}


}
