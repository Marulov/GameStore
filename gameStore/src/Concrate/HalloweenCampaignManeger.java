package Concrate;

import Abstract.CampaignService;
import Entities.Game;

public class HalloweenCampaignManeger implements CampaignService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " adlý oyuna Cadýlar bayramý kampanyasý sayesinde indirim uygulandý. Yeni fiyat: " + game.getDiscount());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Cadýlar bayramý kampanyasý bitmiþtir. " + game.getName() + " adlý oyunun indirimi sonlandýrýlmýþtýr." );
		
	}

}
