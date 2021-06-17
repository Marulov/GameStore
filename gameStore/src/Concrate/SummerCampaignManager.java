package Concrate;

import Abstract.CampaignService;
import Entities.Game;

public class SummerCampaignManager implements CampaignService {

	public void add(Game game) {
		System.out.println(game.getName() + " adlý oyuna Yaz Kampanyasý sayesinde indirim uygulandý. Yeni fiyat: " + game.getDiscount());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Yaz kampanyasý bitmiþtir.");
		
	}

}
