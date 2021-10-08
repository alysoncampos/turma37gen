package entities;

public class Pessoa {
	
	//atributos: o que objeto é, tem, ou estar.
	public String nome;
	public int anoNascimento;
	public boolean viva;
	public String email;
	public char pronome;
	
	//metodo
	public int calculaIdade() {
		return 2021-anoNascimento;
	}
	public int calculaIdade(int ano) {
		return ano-anoNascimento;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", pronome=" + pronome + "]";
	}
	
}
