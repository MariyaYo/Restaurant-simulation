package hraniInapitki;

import java.util.Random;

public class Bezalkoholno extends Napitki{
	
	private String [] names = {"���� ����", "�����", "�����", "������ ���", "���", "����",
								"��������", "��������", "����� �������"};
	Random rn = new Random();
	public Bezalkoholno(){
		int x = rn.nextInt(names.length);
		this.name = names[x];
		this.price = 2;
	}
}