package hraniInapitki;

import java.util.Random;

public class Salati extends Qstiq {
	
	private String [] names = {"GREEK SALAD", "CAESAR WITH CRISPY CALAMARI",  
								"SALAD WITH QUINOA AND WHITE FISH", "SPINACH WITH QUINOA", 
								"SPLENDOR SALAD", "FRESH GARDEN SALAD", "RIGOLETTO",
								"SHOPSKA SALAD", "MOORISH CRUNCH SALAD", "WATERMELON & FETA SALAD",
								"HALLOUMI WITH GRIDDLED VEGETABLES", "WILD RICE SALAD"};

	Random rn = new Random();
	public Salati(){
		int x = rn.nextInt(names.length);
		this.name = names[x];
		this.price = 5;
		int y = rn.nextInt(10) + 30;
		this.gramaj = y*100;
	}
}