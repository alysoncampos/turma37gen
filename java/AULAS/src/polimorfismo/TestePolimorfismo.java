package polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Juliana");
		fisica.setCpf(12345678902L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Cristiano");
		juridica.setCnpj(100010001234567L);
		
		Pessoa[] pessoas = new Pessoa[2];
		pessoas[0]=fisica;
		pessoas[1]=juridica; 
		
		for(Pessoa pessoa:pessoas) {
			System.out.println(pessoa.getNome());
		}
		
		
	}

}
