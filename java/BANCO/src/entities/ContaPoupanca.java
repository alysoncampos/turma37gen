package entities;

public class ContaPoupanca extends Conta {

	private int diaAniversarioPoupanca;

    public ContaPoupanca(int numero, String cpf, int diaAniversarioPoupanca) {
        super(numero, cpf);
        this.diaAniversarioPoupanca = diaAniversarioPoupanca;
    }

    public int getDiaAniversarioPoupanca() {
        return diaAniversarioPoupanca;
    }

    public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
        this.diaAniversarioPoupanca = diaAniversarioPoupanca;
    }
 
    public void correcao(int diaInformado) {
        if (diaInformado == this.diaAniversarioPoupanca) {
            double acrescimo = super.getSaldo()*0.0005;
            super.credito(acrescimo);
        }
        
    }
	
}
