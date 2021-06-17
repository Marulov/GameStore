package Concrate;

import Abstract.CampaignService;
import Entities.Game;

public class HalloweenCampaignManeger implements CampaignService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " adl� oyuna Cad�lar bayram� kampanyas� sayesinde indirim uyguland�. Yeni fiyat: " + game.getDiscount());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Cad�lar bayram� kampanyas� bitmi�tir. " + game.getName() + " adl� oyunun indirimi sonland�r�lm��t�r." );
		
	}

}
