programa
{
/*	
 * 	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de 
 * 	uma atividade e o escreva em seguida.Encontre após a maior pontuação e a apresente. 
 */
	funcao inicio()
	{
		real notas[5]
		real maiorNota=0.00

		para(inteiro x=0; x<5; x++){
			escreva("Digite a ",x+1,"ª nota: ")
			leia(notas[x])
		}
		para(inteiro x=0; x<5; x++){
			escreva("\n",x+1,"ª nota: ",notas[x])
		}
		para(inteiro x=0; x<5; x++){
			se(notas[x]>maiorNota){
				maiorNota = notas[x]
			}	
		}
		escreva("\nA maior nota foi: ",maiorNota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 230; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */