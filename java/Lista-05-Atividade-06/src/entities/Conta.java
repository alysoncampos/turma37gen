package entities;

public class Conta {
	private int Numero;
	private String Cpf;
	public double Saldo=10000.00;
	private boolean Ativa;
	
	
	public Conta() {
		super();
	}
	
	public Conta(int numero, String cpf, double saldo, boolean ativa) {
		super();
		Numero = numero;
		Cpf = cpf;
		Saldo = saldo;
		Ativa = ativa;
	}
	
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public boolean isAtiva() {
		return Ativa;
	}
	public void setAtiva(boolean ativa) {
		Ativa = ativa;
	}
	
	public double sacar(double valorSaque) {
		return Saldo - valorSaque;
	}
	
	public double deposito(double valorDeposito) {
		return Saldo + valorDeposito;
	}
	
	@Override
	public String toString() {
		return "Conta [Numero=" + Numero + ", Cpf=" + Cpf + ", Saldo=" + Saldo + ", Ativa=" + Ativa + "]";
	}

}
