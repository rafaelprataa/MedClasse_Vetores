# Deseja-se saber o número de pessoas presentes em uma sala específica do bloco Q (contendo seis salas) de uma universidade. para isso, é necessário um vetor que tenha tamanho 6 e que cada posição armazene o número de pessoas em cada sala. Qual seria a média de alunos nas salas informadas? Apresente quais são as salas com uma quantidade de pessoas acima da média encontrada. 

## ALGORITMO DO EXERCICIO

    INÍCIO
			C = 1
			Soma = 0

				ENQUANTO C <= 6 FAÇA
  					  LEIA Q[C])
    						Soma = Soma + Q[C]
   							 C = C + 1
				FIM ENQUANTO
				Média <- Soma/6
					IMPRIMA ("A média é:" + Soma)
					IMPRIMA ("E a salas maiores que a média são: Sala 1 com 35, Sala 5 com 36 e Sala 6 com 30 pessoas") 

    FIM

