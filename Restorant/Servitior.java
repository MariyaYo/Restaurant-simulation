package Restorant;
import java.util.Random;

public class Servitior {
	private String name;
	double tips;
	private String [] names = {"���", "������", "�����", "�����", "���������", "�������", "�������", 
			"���������", "�����", "�����", "����", "��������", "���", "�������",
			"�������", "���", "����", "�����", "������", "������", "������", 
			"�����", "�������", "������", "������", "��������", "������", "�����",
			"������", "������"};
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