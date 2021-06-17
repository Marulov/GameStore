package Concrate;

import Abstract.CampaignService;
import Entities.Game;

public class SummerCampaignManager implements CampaignService {

	public void add(Game game) {
		System.out.println(game.getName() + " adl� oyuna Yaz Kampanyas� sayesinde indirim uyguland�. Yeni fiyat: " + game.getDiscount());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Yaz kampanyas� bitmi�tir.");
		
	}

}
