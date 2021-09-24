programa
{
	
	funcao inicio()
	{
	//variaveis
		real indicePoluicao
	//entradas
		escreva("Digite o indice de poluição atual:")
		leia(indicePoluicao)
	//processamento
	//saida
		se (indicePoluicao<=0.29){
			escreva("Indice aceitável!!")
		}
		senao se (indicePoluicao<0.4){
			escreva("GRUPO 1 - PAREM SUAS ATIVIDADES!!")
		}
		senao se (indicePoluicao<0.5){
			escreva("GRUPO 1 E GRUPO 2  - PAREM SUAS ATIVIDADES!!")
		}
		senao {
			escreva("GRUPO 1 - GRUPO 2 - GRUPO 3 - PAREM SUAS ATIVIDADES!!")
		}

		escreva("\nFIM DE PROGRAMA")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 510; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */