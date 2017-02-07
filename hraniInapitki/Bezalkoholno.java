package hraniInapitki;

import java.util.Random;

public class Bezalkoholno extends Napitki{
	
	private String [] names = {"Кока кола", "Фанта", "Пепси", "Студен чай", "Чай", "Кафе",
								"Капучино", "Мокачино", "Топъл шоколад"};
	Random rn = new Random();
	public Bezalkoholno(){
		int x = rn.nextInt(names.length);
		this.name = names[x];
		this.price = 2;
	}
}