package exercicios;
public class MediaClasse {

	public static void main(String[] args) {
		int Soma = 0; // declarei variavel soma com o valor inicial 0
		 int Q[]= {35, 4, 22, 20, 36, 30}; // defini os valores do vetor
		 int n = Q.length;	// defini o tamanho do vetor
		 
		 for (int C=0; C<n;C++) { // for para inciar um laço
			 Soma = Soma + Q [C]; // Soma recebe Soma + o vetor na posição inicial C
		 }
	
		 
		System.out.println("A media e:" + (int) (Soma/n)); // mostra a média 
		System.out.println("E a salas maiores que a média são: Sala 1 com 35, Sala 5 com 36 e Sala 6 com 30 pessoas"); // mostra as salas maiores que a média
				 

	}

}

