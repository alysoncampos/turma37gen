package entities;

public class ContaEstudantil extends Conta{
	private double limiteEstudantil;

	public ContaEstudantil(int numero, String cpf, double limiteEstudantil) {
		super(numero, cpf);
		this.limiteEstudantil = limiteEstudantil;
	}

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	public void usarEstudantil(double valor) {
		double auxValor = 0.00;
		if (valor > super.getSaldo() + this.limiteEstudantil) {
			System.out.println("Impossível realizar a operação...");
		} 
		else if (valor > super.getSaldo()) {
			auxValor = valor - super.getSaldo();
			super.credito(auxValor);
			this.limiteEstudantil = this.limiteEstudantil - auxValor;
			System.out.println("Novo limite estudantil: "+limiteEstudantil);
		}
		
	}

}
