package colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {
	public static void main(String[] args) {
		
		Collection <String> nomes = new ArrayList();
		nomes.add("�lyson");
		nomes.add("Bruna");
		nomes.add("Am�ncio");
		nomes.add("Renan");
		nomes.add("Sylvia");
		
		//Percorre o ArrayList
		for(String name: nomes) {
			System.out.println("Lista de nomes: "+name);
		}
		
		/*Add uma segunda lista ao final da primeira lista:
		Collection <String> nomes2 = Arrays.asList("Maria", "Joana");
		nomes.addAll(nomes2);
		System.out.println("Lista de nomes: "+nomes);*/
		
		/*Para verificar os dados:
		System.out.println("Cont�m o nome Maria? "+nomes.contains("Maria"));
		System.out.println("Lista: "+nomes);*/
		
		/*Limpa a lista:
		System.out.println("Lista de nomes: "+nomes);
		nomes.clear();
		System.out.println("Lista de nomes: "+nomes);*/
		
		/*Remove uma posi��o da lista: 
		System.out.println("Lista de nomes: "+nomes);
		nomes.remove("�lyson");//Remove uma posi��o da lista
		System.out.println("Lista de nomes: "+nomes);*/
		
		/*Mostra se uma lista est� vazia:
		if (nomes.isEmpty()) {
			System.out.println("Lista vazia...");
		}
		else {
			System.out.println("Lista de nomes: "+nomes);
		}
		
		System.out.println("Lista de nomes: "+nomes);*/
		
		
	}
	

}
