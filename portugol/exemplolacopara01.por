programa
{
	
	funcao inicio()
	{
		//TAMANHO FIXO - PARA
		inteiro tamanho
		escreva("Qual o tamnaho da linha: ")
		leia(tamanho)
		
		para (inteiro x=1;x<=10;x++) {
			escreva(x+" PARABÉNS, FERNANDA!!\n")
			linha(tamanho)
			escreva("\n")
		}
		
	}

	funcao linha(inteiro tamanho){
		para (inteiro x=1; x<=tamanho; x++){
			escreva("-")
		}
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */