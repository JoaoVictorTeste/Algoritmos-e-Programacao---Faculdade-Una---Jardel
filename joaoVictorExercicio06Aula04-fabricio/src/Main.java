import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    // #6 crie um programa em java que receba o valor da conta do restaurante.
        //Calcule o acrescimo de 15% de serviço e mostre o valor final.

        Scanner input = new Scanner(System.in);

        double contaRestaurante;


        System.out.println("Qual valor que ficou a conta do restaurante?");
        contaRestaurante = input.nextDouble();

        double acrescimoServico = contaRestaurante * 0.15;
        double valorFinal = contaRestaurante + acrescimoServico;


        System.out.printf("A conta ficou R$ %.2f%n", contaRestaurante);
        System.out.printf("O acréscimo do serviço foi R$ %.2f%n", acrescimoServico);
        System.out.printf("O valor final com serviço é R$ %.2f%n", valorFinal);

}
}