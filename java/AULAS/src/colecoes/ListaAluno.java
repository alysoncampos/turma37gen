package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {

	public static void main(String[] args) {
		
		Set <Aluno> conjunto = new HashSet <Aluno>();
		
		Aluno a = new Aluno ("João da Silva", "JAVA", 6.8);
		Aluno b = new Aluno ("Maria Souza", "Linux", 7.8);
		Aluno c = new Aluno ("Renata Almeida", "SO", 8.8);
		Aluno d = new Aluno ("José Nascimento", "QA", 5.5);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
	}

}
