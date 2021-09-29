programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro total=0
		real media=0.00
		inteiro notas[4]//0-3
		
		escreva("Digite o nome: ")
		leia(nome)
		
		para(inteiro x=0; x<4; x++){
			escreva("Digite a nota: ")
			leia(notas[x])
			total = total + notas[x]
		}
		media = total / 4.00
		escreva("\nMédia notas ",media)
		escreva("\nTotal das notas ",total)
		escreva("\nBoletim")
		para(inteiro i=0; i<4; i++){
			escreva("\nNota ",notas[i])
			se (notas[i]<=5){
				escreva(" ainda não...estude!!")
			} senao {
				escreva(" muito bem continue assim!!")
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 576; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */