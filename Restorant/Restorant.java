package Restorant;
import java.util.ArrayList;

import hraniInapitki.Alkohol;
import hraniInapitki.Bezalkoholno;
import hraniInapitki.Deserti;
import hraniInapitki.Osnovni;
import hraniInapitki.Salati;

public class Restorant{

	private static final int NUMBER_OF_MEALS = 70;
	String name;
	String adress;
	double money;
	ArrayList<Menu> menu = new ArrayList<Menu>();
	Servitior [] servitior;
	
	Restorant(String name, String adress, int servitiori, int money){
		if(name !=null && !name.isEmpty()){
			this.name = name;
		}
		else{
			this.name = "Pri Pesho";
		}
		
		this.servitior = new Servitior[servitiori];
		
		for(int i = 0; i <= NUMBER_OF_MEALS; i++){
			if(i<=10){
				menu.add(new Salati());
			} else{
				if(i<=20){
					menu.add(new Osnovni());
				}else{
					if(i<=30){
						menu.add(new Deserti());
					}else{
						if(i<=50){
							menu.add(new Alkohol());
						}else{
							menu.add(new Bezalkoholno());
						}
					}
				}
			}	
		}	
		if (money >0){
			this.money = money;
		}
		if(adress != null && !adress.isEmpty()){
			this.adress = adress;
		}
	}
}
