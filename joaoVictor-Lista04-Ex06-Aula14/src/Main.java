import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 06 - Jogo de adivinhação

        Defina um número secreto fixo no programa (por exemplo, int numeroSecreto = 42;).
         Crie um programa em que o usuário tenta adivinhar o número.
         A cada tentativa incorreta, o programa deve informar se o número secreto é MAIOR ou MENOR que o
         palpite digitado e pedir um novo palpite. Cada número errado deve ser armazenado em um vetor (array).
         O laço só encerra quando o usuário acertar o número, exibindo no final quantas tentativas foram necessárias.
          Devem ser exibidos também todos os palpites errados que o usuário deu.
                 Exemplo de resultado:
        "Parabéns, você adivinhou! O número secreto é 42!"
        Tentativas: 6

        Palpites:
        1) 12
        2) 50
        3) 30
        4) 40
        5) 44
        6) 42
         */

        Scanner input = new Scanner(System.in);

        ArrayList<String> palpitesErrados = new ArrayList<>();



        int numeroSecreto = 42;
        int numerosDetentativas = 0;
        int numero;

        do {
            System.out.println("===JOGO DA ADIVINHA===");
            System.out.println("Tenta adivinhar qual numero é... ");

            System.out.println("Informe um numero: ");
             numero = input.nextInt();
            numerosDetentativas++;
            palpitesErrados.add(String.valueOf(numero));

            if (numero < numeroSecreto) {
                System.out.println("O numero secreto é MAIOR!!");
            }else {
                System.out.println("O numero secreto é MENOR!");
            }


        }while (numero != numeroSecreto);

        System.out.println("Parabéns, você adivinhou! O número secreto é 42!");
        System.out.println("Tentativas: " +numerosDetentativas);
        System.out.println("palpites: " + palpitesErrados);
    }
}