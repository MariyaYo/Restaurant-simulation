package Klienti;

import java.util.ArrayList;
import java.util.Random;

import Restorant.Menu;
import Restorant.Servitior;
import hraniInapitki.Alkohol;
import hraniInapitki.Napitki;
import hraniInapitki.Osnovni;
import hraniInapitki.Qstiq;

public abstract class Klienti {
	String name;
	double money;	
	private String [] names = {"Ани", "Албена", "Анета", "Бисер", "Борислава", "Божидар", "Виолета", 
			"Валентина", "Диана", "Донка", "Деси", "Елеонора", "Зоя", "Зорница",
			"Златина", "Ива", "Иван", "Ивета", "Марина", "Михаел", "Мартин", 
			"Пенка", "Павлина", "Пламен", "Светла", "Светлана", "Силвия", "Стела",
			"Стефка", "Анелия"};
	Random rn = new Random();
	ArrayList<Menu> menu = new ArrayList<Menu>();
	Order order;
	
	Klienti(){
		int x = rn.nextInt(names.length);
		this.name = names[x];
	}
	
	void makeOrder(Servitior servitior){
		int x = rn.nextInt(9) + 1;
		//order atleast  at least 1 thing
		for(int i =0; i<=x ; i++ ){
			boolean y = rn.nextBoolean();
			if(y){
				Napitki a = new Alkohol();
				this.order.poruchka.add(a);
			}
			else{
				Qstiq b = new Osnovni();
				this.order.poruchka.add(b);
			}
		}
		this.order.Klienta = this;
		this.order.Servitiora = servitior;
		
	}
	void askForReseat(){
	}
	void pay(){
	}
}
	
