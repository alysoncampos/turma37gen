package heranca;

public class Programa {

	public static void main(String[] args) {
		Pessoa jessica = new Pessoa("Jessica",555);
		Funcionario pedro = new Funcionario("Pedro",222,"TI");
		Pessoa maria = new Funcionario("Maria",333,"Informatica-Desenvolvimento");
		Pessoa jose = new Coordenador("José",444,"CC");
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());
	}

}
