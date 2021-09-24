programa
{
	inclua biblioteca Matematica --> math
	funcao inicio()
	{
	//variaveis
		real pesoTomates, excesso, multa
	//entradas
		escreva("Digite o peso total da carga em quilos: ")
		leia(pesoTomates)
	//processamento
	//saidas
		excesso = 0
		multa = 0
		se (pesoTomates>50) {
			excesso = math.arredondar((pesoTomates - 50),2)
			multa = (excesso*4)
			escreva("Você ultrapassou o limite estabelecido em ",excesso, " quilos e pagará R$ ",multa, " de multa") 
		}
		senao {
			escreva("Parabéns, você não ultrapssou o limite!\n")
			escreva("Excesso: ", excesso, " kg\n")
			escreva("Multa: R$ ", multa)
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 256; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */