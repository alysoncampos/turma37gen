programa
{
	inclua biblioteca Matematica --> math
	funcao inicio()
	{
	//variaveis
		real num1, num2, num3, num4, a, b, c, d
	//entradas	
		escreva("Digite o primeiro número: ")
		leia(num1)
		escreva("Digite o segundo número: ")
		leia(num2)
		escreva("Digite o terceiro número: ")
		leia(num3)
		escreva("Digite o quarto número: ")
		leia(num4)

		a = math.potencia(num1, 2)
		b = math.potencia(num2, 2)
		c = math.potencia(num3, 2)
		d = math.potencia(num4, 2)
	//processamento
	//saida
		se (c>=1000) {
			escreva("O terceiro número foi ",num3, " e seu respectivo quadrado é: ", c)
		}
		senao {
			escreva("O primeiro número foi ",num1, " e seu respectivo quadrado é ", a)
			escreva("O segundo número foi ",num2, " e seu respectivo quadrado é ", b)
			escreva("O terceiro número foi ",num3, " e seu respectivo quadrado é ", c)
			escreva("O primeiro número foi ",num4, " e seu respectivo quadrado é ", d)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 346; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */