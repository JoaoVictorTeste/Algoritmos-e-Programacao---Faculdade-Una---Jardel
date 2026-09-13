import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        /* 2. Codifique um programa para calcular as raízes de uma equação do segundo grau, ax2+bx+
        c = 0. Os valores dos coeficientes devem ser lidos pelo teclado. Devem ser observadas as
        seguintes situações:

        (a) a = 0, não se trata de uma equação do segundo grau;
        (b) delta < 0, não existem raízes reais;
        (c) delta > 0, existem duas raízes reais diferentes;
        (d) e delta = 0, existem duas raízes reais iguais. */

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Vamos calcular a equação segundo grau.");

        System.out.println("Digite o valor de A: ");
        a = input.nextInt();

        System.out.println("Digite o valor de B: ");
        b = input.nextInt();

        System.out.println("Digite o valor de C: ");
        c = input.nextInt();

        if (a == 0){
            System.out.println("não é uma equação do 2º grau");
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("São duas raizes reais e distintas." + " O x1 é " + x1 + " o X2 é " + x2);
        }else if (delta < 0) {
            System.out.println("não existem raízes reais!" + delta);
        }else  {
            double raizIgual = -b / (2.0*a);
            System.out.println("existem duas raízes reais iguais! O valor é " + raizIgual);
        }
    }
}