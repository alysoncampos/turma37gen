programa
{
	
	funcao inicio()
	{
		inteiro idade
		escreva("Digite a idade do nadador: ")
		leia(idade)
		se (idade>=18) {
			escreva("Categoria: Adultos")
		}
		senao se (idade<18 e idade>=14) {
			escreva("Categora: Juvenil B")
		}
		senao se (idade<14 e idade>=12) {
			escreva("Categoria: Juvenil A")
		}
		senao se (idade<12 e idade>=8) {
			escreva("Categoria: Infantil B")
		}
		senao se (idade<8 e idade>=5) {
			escreva("Categoria: Infantil A")
		}
		senao {
			escreva("Infelizmente não trabalhamos com essa idade!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 540; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */