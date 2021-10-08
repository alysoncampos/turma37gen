package application;

import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class Programa {

	public static void main(String[] args) {

		Cachorro dog1 = new Cachorro("Mike",2);
		Cavalo house1 = new Cavalo("Flash",4);
		Preguica preg1 = new Preguica("EdNeide",30);
		
		System.out.println(dog1.getNome());
		dog1.correr();
		dog1.emitirSom();
		
		System.out.println(house1.getNome());
		house1.emitirSom();
		
		System.out.println(preg1.getNome());
		preg1.correr();

	}

}
