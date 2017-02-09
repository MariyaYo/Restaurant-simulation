package Klienti;

import Restorant.Servitior;
import hraniInapitki.Alkohol;
import hraniInapitki.Napitki;
import hraniInapitki.Osnovni;
import hraniInapitki.Qstiq;

public class Mutri extends Klienti{
	
	Mutri(){
		super();
		this.money = 50;
	}
	void makeOrder(Servitior servitior){
		int x = rn.nextInt(9) + 1;
		//order at least 1 thing
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
}
