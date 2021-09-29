programa
{
	inclua biblioteca Util 
	
	funcao inicio()
	{
		inteiro jogadas[10]
		real media=0.00
		inteiro valorTotal=0, maiorValor=0, cont=0

		para (inteiro x=0; x<10; x++){
			jogadas[x] = Util.sorteia(1, 6)
			escreva("Lançamento ",x+1," = ",jogadas[x], "\n")
			valorTotal = valorTotal + jogadas[x]//somatorio
			se(jogadas[x] >= maiorValor){
				se(jogadas[x]==maiorValor){
					cont++//toda vez que ele repete
				}
				senao se(jogadas[x]>maiorValor){
					cont = 1//primeira vez do numero
				}
				maiorValor = jogadas[x] 
			}
		}
		
		media = valorTotal/10.00
		escreva("\nMédia: ", media)
		escreva("\nMaior valor: ",maiorValor)
		escreva("\nO maior valor apareceu ",cont," vezes.")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 542; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */