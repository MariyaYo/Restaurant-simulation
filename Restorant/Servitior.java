package Restorant;
import java.util.Random;

public class Servitior {
	private String name;
	double tips;
	private String [] names = {"Ани", "Албена", "Анета", "Бисер", "Борислава", "Божидар", "Виолета", 
			"Валентина", "Диана", "Донка", "Деси", "Елеонора", "Зоя", "Зорница",
			"Златина", "Ива", "Иван", "Ивета", "Марина", "Михаел", "Мартин", 
			"Пенка", "Павлина", "Пламен", "Светла", "Светлана", "Силвия", "Стела",
			"Стефка", "Анелия"};
	Random rn = new Random();
	
	Servitior(){
		int x = rn.nextInt(names.length);
		this.name = names[x];
		this.tips = 0;
	}
	
	double tellHowMuchAllCost(){
		return 0;
		
	}
	void takeOrder(){
		
	}

}