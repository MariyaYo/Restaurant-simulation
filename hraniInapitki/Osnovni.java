package hraniInapitki;

import java.util.Random;

public class Osnovni extends Qstiq{
	
	private String [] names = {"Печено пилешко филе с билки",  "Печено пилешко филе с бадемов сос", 
								"Прясна средиземноморска риба", "Филе от сьомга със сос Малтез",
								"Задушена или пържена пастърва с билки", "Кълцана наденица с пържени картофи", 
								"Шницел по виенски с пържени картофи", "Свинско бонфиле с моцарела", 
								"Вратна пържола на скара (без кост)", "Патешко филе с гъбки", 
								"Задушена или пържена пъстърва", "Печена агнешка плешка с винен сос"};

	Random rn = new Random();
	public Osnovni(){
		int x = rn.nextInt(names.length);
		this.name = names[x];
		this.price = 9;
		int y = rn.nextInt(40) + 40;
		this.gramaj = y*100;
	}
}