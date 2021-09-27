programa
{
	
	funcao inicio()
	{
		cadeia nome
		real nota = 0.00
		real totalNotas = 0.00
		real media = 0.00
		real maiorNota = 0.00
		real menorNota = 10.00
		inteiro contadorMenorNota = 0
		
		escreva("Digite o nome do aluno: ")
		leia(nome)
		
		para(inteiro c=1; c<=4; c++){
			escreva("Digite a ",c, "ª nota: ")
			leia(nota)
			totalNotas = totalNotas + nota
			se (nota > maiorNota){
				maiorNota = nota
			}
			se (nota <= menorNota) {
				se(nota == menorNota){
					contadorMenorNota++
				}
				senao se(nota < menorNota){
					contadorMenorNota=1
				}
				menorNota  = nota
			}
		}
		
		media = totalNotas/4

		escreva("A média do aluno ",nome, " foi: ", media)
		escreva("\nSua maior nota foi ",maiorNota)
		escreva("\nSua menor nota foi ",menorNota)
		escreva("\nA menor nota aparece ",contadorMenorNota)
		escreva("\nFim do programa!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 625; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */