package polimorfismo;

public class PessoaJuridica extends Pessoa {
	private long cnpj;

	public PessoaJuridica() {
		
	}
	
	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		
		return "Pessoa Jurídica: "+super.getNome()+" - CNPJ: "+this.getCnpj();
	}

}
