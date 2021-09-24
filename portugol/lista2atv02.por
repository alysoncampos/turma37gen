programa
{
	
	funcao inicio()
	{
	//variaveis
		inteiro codigo, horas, precoHora, salario, salarioExtra
	//entradas
		escreva("Digite o código do funcionário: ")
		leia(codigo)
		escreva("Digite o numero de horas trabalhadas: ")
		leia(horas)
		precoHora = 10 
		salarioExtra = 0
	//processamento
		se (horas>50) {
			salario = 50 * precoHora
			salarioExtra = (horas-50) * (precoHora*2)	
		}
		senao {
			salario = horas * precoHora
		}
	//saidas
		escreva("O funcionário de código ",codigo, " trabalhou ", horas, " horas\n") 
		escreva("Salário: R$ ", salario, "\n")
		escreva("Extra: R$ ", salarioExtra)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 260; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */