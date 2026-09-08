import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*Exercício 3
         Construa um algoritmo que recebe um número e em seguida exiba uma mensagem, informando se ele é par ou ímpar.
          No primeiro caso, também deve ser exibida uma mensagem informando qual é o quadrado do valor informado,
          no segundo caso, deve também ser exibida uma mensagem informando qual o é o cubo deste número.
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = input.nextInt();

        if(numero % 2 == 0){
            System.out.println("O numero é par.");
            int quadrado = numero*numero;
            System.out.println("O quadrado dele é " + quadrado);
        }else {
            System.out.println("O numero é impar.");
            int cubo = numero*numero*numero;
            System.out.println("O cubo dele é " + cubo);
        }

       
    }
}