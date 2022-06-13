# Deseja-se saber o número de pessoas presentes em uma sala específica do bloco Q (contendo seis salas) de uma universidade. para isso, é necessário um vetor que tenha tamanho 6 e que cada posição armazene o número de pessoas em cada sala. Qual seria a média de alunos nas salas informadas? Apresente quais são as salas com uma quantidade de pessoas acima da média encontrada. 

## ALGORITMO DO EXERCICIO

    INICIO
		IMPRIMA
			"INSIRA O NUMERO DE PESSOAS NA SALA 1:"
		IMPRIMA
			"SALA 2"
		IMPRIMA
			"SALA 3"
		IMPRIMA
			"SALA 4"
		IMPRIMA
			"SALA 5"
		IMPRIMA
			"SALA 6"

				ENQUANTO C<=6 FAÇA
				    (Q[C])
  				    Soma = Soma + Q[C]
    				    C = C + 1
				FIM ENQUANTO
			
				MEDIA = SOMA/6

		IMPRIMA
			("A média de alunos das salas é: " + media)		
		IMPRIMA
			("Salas maiores do que a média: ");
				SE (Q[0] > media
				IMPRIMA 
					"SALA 1"
				SE (Q[1] > media
				IMPRIMA 
					"SALA 2"
				SE (Q[2] > media
				IMPRIMA 
					"SALA 3"
				SE (Q[3] > media
				IMPRIMA 
					"SALA 4"	
				SE (Q[4] > media
				IMPRIMA 
					"SALA 5"
				SE (Q[5] > media
				IMPRIMA 
					"SALA 6"

			IMPRIMA
				"("Salas menores do que a média:)
				SE (Q[0] < media
				IMPRIMA 
					"SALA 1"
				SE (Q[1] < media
				IMPRIMA 
					"SALA 2"
				SE (Q[2] < media
				IMPRIMA 
					"SALA 3"
				SE (Q[3] < media
				IMPRIMA 
					"SALA 4"	
				SE (Q[4] < media
				IMPRIMA 
					"SALA 5"
				SE (Q[5] < media
				IMPRIMA 
					"SALA 6"

				IMPRIMA
					"FIM"
    FIM

![fluxograma](https://user-images.githubusercontent.com/104045633/173460709-92d172d9-b808-487c-ab07-6c8be4279b82.png)




				
