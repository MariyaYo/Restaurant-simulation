package hraniInapitki;

import java.util.Random;

public class Salati extends Qstiq {
	
	private String [] names = {"������ � �������� �������", "������ ��� �������� ���� ������",  
								"������ ��� �������� ��������� � ������", "������ ������", 
								"������� � ���� �� ��������, ������ ������ � ������� ����",
								"������ �����", "������ � ������ � ��������",
								"������ ��� ������", "������ ������", "������ �������",
								"������ �������", "�������� ������"};

	Random rn = new Random();
	public Salati(){
		int x = rn.nextInt(names.length);
		this.name = names[x];
		this.price = 5;
		int y = rn.nextInt(10) + 30;
		this.gramaj = y*100;
	}
}