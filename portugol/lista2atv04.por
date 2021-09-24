programa
{
	
	funcao inicio()
	{
	//variaveis
		inteiro num
	//entrada
		escreva("Digite um número inteiro: ")
		leia(num)
	//processamento
	//saida
		se (num>0){
			se (num%2==0) {
				escreva("O número ", num, " é par!")
			}
			senao {
				escreva("O número ", num, " é impar!")
			}
		}
		senao se (num==0) {
			escreva("Erro! Você digitou ", num, ", ele é um número neutro!!")
		}
		senao {
			escreva("Erro! Você digitou ", num, ", ele é um número negativo!!")
		}
		
		escreva("\nFIM DO PROGRAMA")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 473; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */