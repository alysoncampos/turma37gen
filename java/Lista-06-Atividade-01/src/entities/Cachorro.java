package entities;

public class Cachorro extends Animal {
	
	public Cachorro (String nome, int idade) {
		super(nome, idade);
	}
	
	public void abanandoRabo() {
		System.out.println("Abanando o rabo...");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Emitindo som: au au au...");
	}
}
