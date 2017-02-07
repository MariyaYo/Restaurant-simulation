package hraniInapitki;

import java.util.Random;

public class Salati extends Qstiq {
	
	private String [] names = {"Салата с изпечено телешко", "Салата със запечено козе сирене",  
								"Салата със запечени зеленчуци и Халуми", "Салата Табуле", 
								"Айсберг с яйца от пъдпъдък, сушени домати и кедрови ядки",
								"Салата Цезар", "Салата с рукола и моцарела",
								"Салата със сьомга", "Гръцка салата", "Салата Капрезе",
								"Салата Паезана", "Пикантна салата"};

	Random rn = new Random();
	public Salati(){
		int x = rn.nextInt(names.length);
		this.name = names[x];
		this.price = 5;
		int y = rn.nextInt(10) + 30;
		this.gramaj = y*100;
	}
}