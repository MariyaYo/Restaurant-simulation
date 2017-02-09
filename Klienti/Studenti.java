package Klienti;

import Restorant.Servitior;
import hraniInapitki.Alkohol;
import hraniInapitki.Bezalkoholno;
import hraniInapitki.Deserti;
import hraniInapitki.Napitki;
import hraniInapitki.Osnovni;
import hraniInapitki.Qstiq;
import hraniInapitki.Salati;

public class Studenti  extends Klienti{
	
	Studenti(){
		super();
		this.money = 10;
	}


	void makeOrder(Servitior servitior){
		int x = rn.nextInt(9) + 1;
		//order at least 1 thing
		for(int i =0; i<=x ; i++ ){
			boolean y = rn.nextBoolean();
			if(y){
				Napitki a;
				int z = rn.nextInt(1);
				switch (z) {
				case 1:
					a = new Alkohol();
					break;

				default:
					a = new Bezalkoholno();
					break;
				}
						
				this.order.poruchka.add(a);
			}
			else{
				Qstiq b;
				int z = rn.nextInt(2);
				switch (z) {
				case 1:
					b = new Osnovni();
					break;
				case 2:
					b = new Deserti();
					break;
				default:
					b = new Salati();
					break;
				}
				this.order.poruchka.add(b);
			}
		}
		this.order.Klienta = this;
		this.order.Servitiora = servitior;
	}
}
