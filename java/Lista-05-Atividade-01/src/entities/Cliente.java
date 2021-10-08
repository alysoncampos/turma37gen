package entities;

public class Cliente {
	private String nome;
	private String cpf;
	private int idade;
	private String pagamento;
	
	public Cliente() {

	}

	public Cliente(String nome, String cpf, int idade, String pagamento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.pagamento = pagamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	@Override
	public String toString() {
		return "Cliente: nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", pagamento=" + pagamento + "]";
	}
	
	
	

	
	
	
	
}
