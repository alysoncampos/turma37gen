programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro anos, meses, dias
		
		escreva("Digite seu nome: ")
		leia(nome)
		
		escreva("Digite quantos dias de vida você tem: ")
		leia(dias)

		anos = dias/365
		meses = (dias%365)/30
		dias = (dias%365)%30

		escreva(nome, " você tem: ",anos, " anos, " ,meses, " meses e ", dias, " dias." )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 113; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */