programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		real custoConsumidor, custoFabrica, distribuidor, impostos
		escreva("Digite o custo de fábrica do automóvel: ")
		leia(custoFabrica)

		distribuidor = custoFabrica * 28 / 100
		impostos = custoFabrica * 45 / 100

		custoConsumidor = math.arredondar(custoFabrica + distribuidor + impostos, 2)

		escreva("O custo ao consumidor é de R$ ", custoConsumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 439; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */