import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*  03 - Uma estação meteorológica precisa registrar a temperatura média
            dos 5 primeiros dias da semana (de Segunda a Sexta-feira).

            Escreva um programa em Java que:
            1.Peça para o usuário digitar a temperatura de cada um dos 5 dias.
            2.Calcule e exiba a temperatura média da semana.
            3.Identifique e exiba quais dias (ex: "Dia 1", "Dia 3", ou “Segunda-feira”,“Terça-feira”...)
            tiveram temperatura estritamente acima da média calculada.
         */

        Scanner input = new Scanner(System.in);

        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
        double[] temperaturas = new double[5];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a temperatura de " + dias[i] + ": ");
            temperaturas[i] = input.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];
        }
        double media = soma / temperaturas.length;
        System.out.println("\nMédia da semana: " + media);

        System.out.println("\nDias com temperatura acima da média:");
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > media) {
                System.out.println(dias[i] + ": " + temperaturas[i]);
            }
        }
    }
}