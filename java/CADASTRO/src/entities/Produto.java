package entities;

public class Produto {
	
	public String codigo;
	public String nome;
	public double valor;
	public int estoque;
	
	
	public void tirarEstoque(int quantidade) {
		estoque = estoque - quantidade;
	}
	public void colocarEstoque(int quantidade) {
		estoque = estoque + quantidade;
	}
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + ", estoque=" + estoque + "]";
	}
}
