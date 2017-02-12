package hraniInapitki;
import java.util.Random;

public class Alkohol extends Napitki{
	
	private String [] names = {"Gin", "Whisky", "Vodka", "Beer", "Tequila with lemon", 
								"Chocolate liqueur", " Baileys", "Jagermeister"};
	Random rn = new Random();
	public Alkohol(){
		int x = rn.nextInt(names.length);
		this.name = names[x];
		this.price = 4;
	}
}
