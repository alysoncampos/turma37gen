programa
{
	
	funcao inicio()
	{
	//variaveis
		const real VALORHORANORMAL=10.00
		const real VALORHORAEXTRA=20.00
		const inteiro HORASNORMAIS=50
		
		cadeia codigo
		inteiro horasTrabalhadas=0
		inteiro E=0
		real salario=0.00
		real salarioTotal=0.00
		real salarioExtra=0.00
	//entradas
		escreva("Digite o código do funcionário: ")
		leia(codigo)
		escreva("Digite o numero de horas trabalhadas: ")
		leia(horasTrabalhadas)
	//processamento
		se (horasTrabalhadas>HORASNORMAIS) {
			E = horasTrabalhadas - HORASNORMAIS
			salario = HORASNORMAIS * VALORHORANORMAL
			salarioExtra = E * VALORHORAEXTRA
			salarioTotal = salario + salarioExtra
		}
		senao {
			salario = horasTrabalhadas * VALORHORANORMAL
			salarioTotal = salario + salarioExtra
		}
	//saidas
		escreva("\nSalário       R$ : ", salario)
		escreva("\nSalário extra R$ : ", salarioExtra)
		escreva("\nSalário Total R$ : ", salarioTotal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 752; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */