import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        /* Exercício 4 - Repetição de mensagem personalizada
        Solicite ao usuário um número inteiro N. Em seguida, exiba a mensagem "Praticando lógica de programação!"
        exatamente N vezes no console.
        Foco: Controlar o limite superior do laço utilizando uma variável digitada pelo usuário via Scanner.
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numeroInteiro = input.nextInt();

       for(int i = 0; i < numeroInteiro; i++){
           System.out.println("Praticando logica de programação!");

       }

    }
}