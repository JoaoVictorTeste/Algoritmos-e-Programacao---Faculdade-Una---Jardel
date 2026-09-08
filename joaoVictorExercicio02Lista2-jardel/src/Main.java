import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /* Exercício 2
         Faça um algoritmo em Java que leia a quantidade de kWh consumidos por uma residência em um mês e calcule e mostre
         o valor da conta de energia elétrica, seguindo as regras:
         Até 100 kWh = R$ 0,50 por kWh
          De 101 até 200 kWh = R$ 0,70 por kWh
          Acima de 200 kWh = R$ 0,90 por kWh
            */

        Scanner input = new Scanner(System.in);

        double kWh;

        System.out.println("Qual a quantidade de consumo kWh da sua residencia em um mês? ");
        kWh = input.nextDouble();

        if(kWh <= 100){
            double kwhValor50 = 0.50;
            double kwhPrecoConsumo100 = kWh * kwhValor50;
            System.out.println("Voce esta pagando R$"+ kwhPrecoConsumo100 + " reais");
            System.out.println("Voce esta pagando R$ 0,50 por kWh ");

        } else if (kWh > 200) {
            double kwhValor90 = 0.90;
            double kwhPrecoConsumo200 = kWh * kwhValor90;
            System.out.println("Voce esta pagando R$"+ kwhPrecoConsumo200 + " reais");
            System.out.println("Voce esta pagando R$ 0,90 por kWh ");

        }else {
            double kwhValor70 = 0.70;
            double kwhPrecoConsumo101 = kWh * kwhValor70;
            System.out.println("Voce esta pagando R$"+ kwhPrecoConsumo101 + " reais");
            System.out.println("Voce esta pagando R$ 0,70 por kWh ");
        }
    }
}