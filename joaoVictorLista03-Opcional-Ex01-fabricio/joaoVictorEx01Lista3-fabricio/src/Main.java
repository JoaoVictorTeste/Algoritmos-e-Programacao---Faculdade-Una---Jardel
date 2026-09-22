import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        /*
         * 1. Codifique um programa que calcule a função f(x) de acordo com a seguinte definição:
         *
         *        | 1,       se x <= 1
         *        | 2,       se 1 < x <= 2
         * f(x) = | x^2,     se 2 < x <= 3
         *        | x^3,     se x > 3
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de x: ");
        double x = input.nextDouble();

        double resultado;

        if (x <= 1){
            resultado = 1;
        } else if (x > 1 && x <= 2) {
            resultado = 2;
        }else if (x > 2 && x <= 3){
            resultado = x * x;
        }else if (x > 3){
            resultado = x * x * x;
        }else {
            System.out.println("O valor informado esta fora do limete permitido.");
            return;
        }
        System.out.println("O resultado é " + resultado);
    }
}