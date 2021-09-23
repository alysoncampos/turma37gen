programa
{
	inclua biblioteca Matematica --> math
	funcao inicio()
	{
		real a, b, c, d, r, s
		escreva("Digite o valor de A:")
		leia(a)
		escreva("Digite o valor de B:")
		leia(b)
		escreva("Digite o valor de C:")
		leia(c)

		r = (a + b)
		r = math.potencia(r, 2)

		s = (b + c)
		s = math.potencia(s, 2)

		d = (r + s) /2

		escreva("O valor de D é ", d)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 369; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */