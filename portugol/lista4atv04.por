programa
{
	
	funcao inicio()
	{	
		const inteiro TOTAL=3
		inteiro mat[TOTAL][TOTAL]
		inteiro somaTotal=0, somaDiagonal=0

		para(inteiro l=0; l<TOTAL; l++){
			para(inteiro c=0; c<TOTAL; c++){
				escreva("Digite o valor: ")
				leia(mat[l][c])
			}
		}
		para(inteiro l=0; l<TOTAL; l++){
			para(inteiro c=0; c<TOTAL; c++){
				somaTotal = somaTotal + mat[l][c]
			}
		}
		para(inteiro x=0; x<TOTAL; x++){
			somaDiagonal = somaDiagonal + mat[x][x] 
		}
		
		escreva("\nA soma total da matriz foi: ",somaTotal)
		escreva("\nA soma da diagonal principal é: ", somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */