programa
{
	
	funcao inicio()
	{
		real base, altura, area
		escreva("Digite a medida da base do triangulo: ")
		leia(base)
		escreva("Digite a medida da altura do triangulo: ")
		leia(altura)

		se (base>0 e altura>0) {
			area = (base*altura)/2
			escreva("A área do triangulo é: ", area, " cm².")
		}
		senao {
			escreva("Erro! As medidas devem ser maiores que 0.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */