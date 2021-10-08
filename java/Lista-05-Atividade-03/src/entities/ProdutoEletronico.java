package entities;

public class ProdutoEletronico {
	private String modelo;
	private String marca;
	private double valor;
	private boolean ligado;
	
	public ProdutoEletronico(String nome, String marca, double valor, boolean ligado) {
		this.modelo = nome;
		this.marca = marca;
		this.valor = valor;
		this.ligado = ligado;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	@Override
	public String toString() {
		return "ProdutoEletronico [nome=" + modelo + ", marca=" + marca + ", valor=" + valor + ", ligado=" + ligado + "]";
	}
	

}
