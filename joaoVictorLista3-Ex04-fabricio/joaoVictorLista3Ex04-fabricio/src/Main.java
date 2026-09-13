import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        4. Escreva um programa que receba o número do mês e retorne o nome do mesmo, por exemplo: 1 – Janeiro, 2 – Fevereiro...
        O programa deverá apresentar uma mensagem de erro caso
        o valor fornecido esteja fora do intervalo de meses.
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero 1 a 12, para descobrir o mes: ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println("1 - Janeiro");
                break;
            case 2:
                System.out.println("2 - Fevereiro");
                break;
            case 3:
                System.out.println("3 - Marco");
                break;
            case 4:
                System.out.println("4 - Abril");
                break;
            case 5:
                System.out.println("5 - Maio");
                break;
            case 6:
                System.out.println("6 - Junho");
                break;
            case 7:
                System.out.println("7 - Julho");
                break;
            case 8:
                System.out.println("8 - Agosto");
                break;
            case 9:
                System.out.println("9 - Setembro");
                break;
            case 10:
                System.out.println("10 - outubro");
                break;
            case 11:
                System.out.println("11 - novembro");
                break;
            case 12:
                System.out.println("12 - dezembro");
                break;
            default:
                System.out.println("Numero invalido!");
        }
    }
}