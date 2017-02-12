package Restorant;
import java.util.Random;

public class Servitior {
	private String name;
	double tips;
	private String [] names = {"Ana", "Albena", "Aneta", "Biser", "Borislava", "Bojidar", "Violeta", 
			"Valentin", "Diana", "Daniel", "Desislava", "Emil", "Zoya", "Zdravko",
			"Zlatina", "Ivan", "Iva", "Iskren", "Marina", "Mihail", "Martin", 
			"Petya", "Pablo", "Plamen", "Svetla", "Svetlina", "Stanislav", "Stela",
			"Steff", "Anelia"};
	Random rn = new Random();
	
	Servitior(){
		int x = rn.nextInt(names.length);
		this.name = names[x];
		this.tips = 0;
	}
	
	public double tellHowMuchAllCost(){
		return 0;
		
	}
	void takeOrder(){
		
	}

}