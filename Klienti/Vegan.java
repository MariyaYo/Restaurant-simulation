package Klienti;

import Restorant.Servitior;
import hraniInapitki.Alkohol;
import hraniInapitki.Bezalkoholno;
import hraniInapitki.Napitki;
import hraniInapitki.Qstiq;
import hraniInapitki.Salati;

public class Vegan  extends Klienti{
	
	Vegan(){
		super();
		this.money = 30;
	}
	void makeOrder(Servitior servitior){
		int x = rn.nextInt(9) + 1;
		//order at least 1 thing
		for(int i =0; i<=x ; i++ ){
			boolean y = rn.nextBoolean();
			if(y){
				Napitki a = new Bezalkoholno();
				this.order.poruchka.add(a);
			}
			else{
				Qstiq b = new Salati();
				this.order.poruchka.add(b);
			}
		}
		this.order.Klienta = this;
		this.order.Servitiora = servitior;
	}
}