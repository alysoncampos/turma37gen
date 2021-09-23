programa {

	funcao inicio() {
		//programa que receba o nome de uma pessoa
		//receba o ano de nascimento
		//mostre como resultador: Oi, [nome da pessoa], sua idade é [idade]
		/*
		 * Programa: objetivo
		 * Inicio
		 * 	ingredientes - variaveis - tudo que vareia
 		 *	entradas - chegam as coisas
 		 * 	processamentos - modo de preparo
 		 * 	saidas - serve ou tira do forno
 		 * Fim
		 */
		 //variaveis
		 cadeia nome
		 inteiro anoNascimento, idade //camelCase - PascalCase
		 //entrada
		 escreva("Qual o seu nome: ")
		 leia(nome)
		 escreva("Qual o seu ano de nascimento: ")
		 leia(anoNascimento)
		 //processamento
		 idade = 2021 - anoNascimento
		 //saida
		 escreva("Oi, ",nome, ", sua idade é ",idade," anos aproximadamente!")
		 
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 527; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */