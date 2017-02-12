package hraniInapitki;

import java.util.Random;

public class Osnovni extends Qstiq{
	
	private String [] names = {"TENDER CHICKEN LOINS WITH ROASTED VEGETABLES",  
								"CHICKEN ALFREDO WITH BOLETUS", 
								"HOME MADE CHICKEN STEAK", "CRUNCHY FILLETS",
								"FISH FILLETS IN PARMESAN", "SALMON WITH SPINACH", 
								"SEAFOOD RISOTTO", "SHRIMP ON A PLATE", 
								"BRAISED BEEF IN AROMATIC SAUCE", "STREAKY PORK WITH ROASTED POTATOES", 
								"PORK RIBS WITH FRESH POTATOES", "MEATBALLS WITH MUSHROOM SAUCE"};

	Random rn = new Random();
	public Osnovni(){
		int x = rn.nextInt(names.length);
		this.name = names[x];
		this.price = 9;
		int y = rn.nextInt(40) + 40;
		this.gramaj = y*100;
	}
}