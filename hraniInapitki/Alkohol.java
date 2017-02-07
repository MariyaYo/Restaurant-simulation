package hraniInapitki;
import java.util.Random;

public class Alkohol extends Napitki{
	
	private String [] names = {"Джин", "Уски", "Водка", "Бира", "Текила с лионче", 
								"Шоколадов ликьор", " Бейлис", "Йегермайстер", "Ракия"};
	Random rn = new Random();
	public Alkohol(){
		int x = rn.nextInt(names.length);
		this.name = names[x];
		this.price = 4;
	}
}
