import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        01 - Faça um algoritmo que peça ao usuário um número inteiro qualquer. Em seguida, mostre o fatorial desse número.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int number = input.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= number; i++){
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial é "+ number + " é" + fatorial);
    }
}