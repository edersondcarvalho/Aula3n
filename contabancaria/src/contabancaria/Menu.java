package contabancaria;

import contabancaria.model.Conta;

public class Menu {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(1, 123, 1, "Adriana", 1000000.0f);
		
		c1.visualizar();
		
		c1.sacar(1000.0f);
		
		c1.visualizar();
		
		
		

	}

}
