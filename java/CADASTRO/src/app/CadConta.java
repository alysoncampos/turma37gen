package app;

import entities.Conta;

public class CadConta {

	public static void main(String[] args) {
		
		Conta cp1 = new Conta(100,"111.111.111-11",100.00,true);
		
		cp1.ativarConta();
		
		System.out.println(cp1.getSaldo());
		cp1.credito(50.50);
		System.out.println(cp1.getSaldo());

	}

}
