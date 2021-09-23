programa
{
	inclua biblioteca Matematica --> math
	funcao inicio()
	{
		cadeia nome
		real temp_f, temp_c
		
		escreva("Informe o seu nome: ")
		leia(nome)

		escreva("Informe a temperatura atual em °C: ")
		leia(temp_c)

		temp_f = (temp_c * 1.8) + 32
		temp_f = math.arredondar(temp_f, 1)

		escreva("Oi " ,nome, ", a temperatura atual em Recife está: ", temp_f, "°F.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 221; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */