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
	private String [] names = {"Ana", "Albena", "Aneta", "Biser", "Borislava", "Bojidar", "Violeta", 
			"Valentin", "Diana", "Daniel", "Desislava", "Emil", "Zoya", "Zdravko",
			"Zlatina", "Ivan", "Iva", "Iskren", "Marina", "Mihail", "Martin", 
			"Petya", "Pablo", "Plamen", "Svetla", "Svetlina", "Stanislav", "Stela",
			"Steff", "Anelia"};
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
	