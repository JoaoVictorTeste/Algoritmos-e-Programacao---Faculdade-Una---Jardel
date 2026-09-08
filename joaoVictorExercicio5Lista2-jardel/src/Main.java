import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*Exercício 5
        Faça um algoritmo que leia uma temperatura em graus Celsius e pergunte ao usuário para qual unidade ele deseja converter.
        Peça a ele para digitar 1 se desejar converter para Fahrenheit (F=C1.8+32) ou digitar 2 se desejar para Kelvin (K=C+273.15).
         Caso o usuário digite uma opção diferente, exiba uma mensagem de opção inválida.
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Informe  a temperatura em graus Celsius: ");
        double temperatura = input.nextDouble();

        System.out.println("Digite 1 para converter para Fahrenheit ou 2 para converter para Kelvin: ");
        int opcao = input.nextInt();

        if (opcao == 1) {
            double fahrenheit = temperatura * 1.8 + 32;
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        } else if (opcao == 2) {
            double kelvin = temperatura + 273.15;
            System.out.println("A temperatura em Kelvin é: " + kelvin);
        } else {
            System.out.println("Opção inválida.");
        }
    }
    }
