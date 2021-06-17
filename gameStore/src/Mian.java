import java.time.LocalDate;

import Adapters.MernisCheckManager;
import Concrate.CustomerManager;
import Concrate.EpicSaleManager;
import Concrate.HalloweenCampaignManeger;
import Concrate.MyCheckManager;
import Concrate.SteamSaleManager;
import Concrate.SummerCampaignManager;
import Entities.Game;
import Entities.Gamer;

public class Mian {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer("Marulov", 1, "Nazým", "Marul", LocalDate.of(1999, 02, 16), "11111111111");
		Game game1 = new Game(1, "Eragon", 30, 10 ,10);
		Game game2 = new Game(2, "GTA 5", 150, 15, 5);
		
		CustomerManager customerManager = new CustomerManager( new MyCheckManager());
		customerManager.add(gamer1);
		
		SteamSaleManager steamSaleManager = new SteamSaleManager();
		steamSaleManager.sale(game1, gamer1);
		
		EpicSaleManager epicSaleManager = new EpicSaleManager();
		epicSaleManager.sale(game2, gamer1);
		
		HalloweenCampaignManeger halloweenCampaignManeger = new HalloweenCampaignManeger();
		halloweenCampaignManeger.add(game1);
		halloweenCampaignManeger.delete(game1);
		
		SummerCampaignManager summerCampaignManager = new SummerCampaignManager();
		summerCampaignManager.add(game2);
		summerCampaignManager.delete(game2);
		

	}

}
