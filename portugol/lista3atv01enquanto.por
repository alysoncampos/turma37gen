programa
{
	
	funcao inicio()
	{
		real media=0.00, totalValoresDigitados=0.00
		inteiro valorDigitado=0, total=0
		enquanto(valorDigitado >= 0){
			escreva("Digite um número negativo para parar: ")
			leia(valorDigitado)
			se (valorDigitado >= 0){
				total = total + valorDigitado
				totalValoresDigitados++
			}
		}
		media = total/totalValoresDigitados 
		escreva("Quantidade de números digitados: ",totalValoresDigitados)
		escreva("\nSomatório dos valores digitados: ",total)
		escreva("\nMédia dos números digitados foi: ",media)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 546; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */