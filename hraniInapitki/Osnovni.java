package hraniInapitki;

import java.util.Random;

public class Osnovni extends Qstiq{
	
	private String [] names = {"������ ������� ���� � �����",  "������ ������� ���� � ������� ���", 
								"������ ���������������� ����", "���� �� ������ ��� ��� ������",
								"�������� ��� ������� �������� � �����", "������� �������� � ������� �������", 
								"������ �� ������� � ������� �������", "������� ������� � ��������", 
								"������ ������� �� ����� (��� ����)", "������� ���� � �����", 
								"�������� ��� ������� ��������", "������ ������� ������ � ����� ���"};

	Random rn = new Random();
	public Osnovni(){
		int x = rn.nextInt(names.length);
		this.name = names[x];
		this.price = 9;
		int y = rn.nextInt(40) + 40;
		this.gramaj = y*100;
	}
}