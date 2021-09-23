programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro anos, meses, dias, totalDias
		
		escreva("Digite o seu nome: ")
		leia(nome)
		
		escreva("Digite sua idade: ")
		leia(anos)
		
		escreva("Digite quantos meses: ")
		leia(meses)
		
		escreva("Digite quantos dias: ")
		leia(dias)

		totalDias = (anos*365) + (meses*30) + dias
		
		escreva("Oi ", nome, ", a sua idade expressa em dias aproximadamente é: ", totalDias, " dias.")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 314; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */