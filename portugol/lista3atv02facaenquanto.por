programa
{
	//programa que pega um número do teclado e calcula a soma de todos os números  de 1 até ele.
	funcao inicio()
	{
		inteiro numeroFinal=0, i=1, soma=0
		
		escreva("Digite o número final : ")
		leia(numeroFinal)

		faca {
			soma = soma + i
			i++ 
		} enquanto (i <= numeroFinal)
		
		escreva("A soma de todos os números até o número final foi: ",soma)
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