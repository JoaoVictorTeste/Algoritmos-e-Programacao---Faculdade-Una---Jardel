import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] semana = new double[5];
        String[] diasDaSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};

        System.out.println("Vamos acompanhar o faturamento:");

        for (int i = 0; i < semana.length; i++) {
            System.out.print("Digite o faturamento de " + diasDaSemana[i] + ": R$ ");
            semana[i] = input.nextDouble();
        }

        double totalFaturamento = 0;
        for (int i = 0; i < semana.length; i++) {
            totalFaturamento += semana[i];
        }

        double mediaDiaria = totalFaturamento / semana.length;

        System.out.println("\nFaturamento total: R$ " + totalFaturamento);
        System.out.println("Média diária: R$ " + mediaDiaria);


        System.out.println("\nDias abaixo da média:");
        for (int i = 0; i < semana.length; i++) {
            if (semana[i] < mediaDiaria) {
                System.out.println(diasDaSemana[i] + " ficou abaixo da média com R$ " + semana[i]);
            }
        }
    }
}