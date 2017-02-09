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
	
	abstract void makeOrder(Servitior servitior);
	void askForReceipts(){
		this.order.price = this.order.Servitiora.tellHowMuchAllCost();
	}
	void pay(){
	}
}
	