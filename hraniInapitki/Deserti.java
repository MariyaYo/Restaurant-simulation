package hraniInapitki;

import java.util.Random;

public class Deserti extends Qstiq{
	
	private String [] names = {"�����", "��������", "���� ����", "�������� �� �����", 
								"����� � ����", "���� �������"};
	Random rn = new Random();
	public Deserti(){
		int x = rn.nextInt(names.length);
		this.name = names[x];
		this.price = 4;
		int y = rn.nextInt(9);
		this.gramaj = y*10 + 200;
	}
}