import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* DESAFIO:
    Faça um programa que leia dois valores inteiros para as variáveis A e B.
    Em seguida,o algoritmo deve trocar os valores entre elas (o valor que estava em A passa para B, e o que estava em B passa para A)
    e imprimir os novos valores na tela.
*/
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = input.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = input.nextInt();

        System.out.println("Antes da troca: A = " + a + ", B = " + b);

        int temporario = a;
        a = b;
        b = temporario;

        System.out.println("Depois da troca: A = " + a + ", B = " + b);
    }
    }