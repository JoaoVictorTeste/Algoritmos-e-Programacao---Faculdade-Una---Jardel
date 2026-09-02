import java.util.Scanner;
/*
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numb01;
        int numb02;
        int numb03;
        int numb04;

        System.out.println("Digita o primeiro numero: ");
        numb01 = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        numb02 = input.nextInt();

        System.out.println("Digite o terceiro numero: ");
        numb03 = input.nextInt();

        System.out.println("Digite o quarto numero: ");
        numb04 = input.nextInt();

        int soma = numb01 + numb02 + numb03 + numb04;

        System.out.println("A Soma entre os numeros que voce informou foi:  " + numb01 + " + " + numb02 + " + " + numb03 + " + " + numb04 + " = " + soma);

        double media = soma / 4;

        System.out.println("A média aritmetica é : " + media);

    }
}
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numeros;


        System.out.println("Digita o primeiro numero: ");
        numeros = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        numeros = input.nextInt();

        System.out.println("Digite o terceiro numero: ");
        numeros = input.nextInt();

        System.out.println("Digite o quarto numero: ");
        numeros = input.nextInt();

        int soma = numeros * 4;

        System.out.println("A Soma entre os numeros que voce informou foi:  " + soma);

        double media = soma / 4;

        System.out.println("A média aritmetica é : " + media);

    }
}