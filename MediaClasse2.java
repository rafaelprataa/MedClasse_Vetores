package exercicios;
import java.util.Scanner;
public class MediaClasse2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0;

        int q[]={0, 0, 0, 0, 0, 0}; // declaro os valores do meu vetor
        int n = q.length; // declaro o tamanho do meu vetor
    
        System.out.print("Sala 1: ");
        q[0] = entrada.nextInt(); // vetor posição 1 recebe o valor digitado e assim respectivamente

        System.out.print("Sala 2: ");
        q[1] = entrada.nextInt();

        System.out.print("Sala 3: ");
        q[2] = entrada.nextInt();

        System.out.print("Sala 4: ");
        q[3] = entrada.nextInt();

        System.out.print("Sala 5: ");
        q[4] = entrada.nextInt();

        System.out.print("Sala 6: ");
        q[5] = entrada.nextInt();
        
        entrada.close();

        for(int c=0; c<n;c++){ // iniciei o laço for
            soma = soma + q[c];
        }

        int media = soma/n;

        System.out.println("A média de alunos das salas é: " + media); // mostra a média 
  
        System.out.println("Salas maiores do que a média: "); // mostra salas maiores que a média
        if(q[0] > media){ 
            System.out.println("Sala 1"); // se o vetor posição 1 for maior que média, exiba SALA 1 e assim respectivamente
        }
        if(q[1] > media){
            System.out.println("Sala 2");
        }
        if(q[2] > media){
            System.out.println("Sala 3");
        }
        if(q[3] > media){
            System.out.println("Sala 4");
        }
        if(q[4] > media){
            System.out.println("Sala 5");
        }
        if(q[5] > media){
            System.out.println("Sala 6");
        }

        System.out.println("Salas menores do que a média: "); // Mostra salas menores que a média
        
        if(q[0] < media){
            System.out.println("Sala 1"); // se o vetor POSIÇÃO 1 for menor do que a média, exiba SALA 1 e assim respectivamente
        }
        if(q[1] < media){
            System.out.println("Sala 2");
        }
        if(q[2] < media){
            System.out.println("Sala 3");
        }
        if(q[3] < media){
            System.out.println("Sala 4");
        }
        if(q[4] < media){
            System.out.println("Sala 5");
        }
        if(q[5] < media){
            System.out.println("Sala 6");
        }
        System.out.println("FIM");

        
    }
        
}
		
		
	