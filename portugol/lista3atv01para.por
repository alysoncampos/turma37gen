programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		
		real salario=0.00, totalSalario=0.00, mediaSalario=0.00 
		real maiorSalario=0.00, mediaFilhos=0.00, contadorAteCem=0.00 
		real percentualAteCem=0.00, totalFilhos=0.00
		inteiro totalPessoas=0, filhos=0 

		escreva("Digite o total de pessoas que serão entrevistadas: ")
		leia(totalPessoas)
	
		para (inteiro cont=1; cont<=totalPessoas; cont++){
			escreva("Salário da ",cont, "ª pessoa: R$ ")
			leia(salario)
			totalSalario = totalSalario + salario
			
			escreva("Quantidade de filhos da ", cont, "ª pessoa: ")
			leia(filhos)
			totalFilhos = totalFilhos + filhos

			se (salario > maiorSalario){
				maiorSalario = salario
			}
			se (salario <= 100) {
				contadorAteCem++ 
			}

		}
		mediaSalario = math.arredondar(totalSalario/totalPessoas,2)
		mediaFilhos = totalFilhos/totalPessoas
		percentualAteCem = math.arredondar((contadorAteCem/totalPessoas)*100.00,2)
		
		escreva("\n")
		escreva("Média do salario da População: R$ ",mediaSalario)
		escreva("\nMédia de filhos da População: ",mediaFilhos)
		escreva("\nO maior salário foi: R$ ",maiorSalario)
		escreva("\nPercentual de pessoas com salário até R$100,00: ",percentualAteCem,"%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 711; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */