package hraniInapitki;

import java.util.Random;

public class Bezalkoholno extends Napitki{
	
	private String [] names = {"Koka kola", "Fanta", "Pepsi", "Ice tea", "Hot tea", "Caffe",
								"Cappuccino", "Mochaccino", "Hot chocolate"};
	Random rn = new Random();
	public Bezalkoholno(){
		int x = rn.nextInt(names.length);
		this.name = names[x];
		this.price = 2;
	}
}