import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Exercício 2
        //Peça ao usuário para digitar três números inteiros. Em seguida, calcule e mostre:
        //A soma dos três números
        //A média aritmética entre eles.

        Scanner input = new Scanner(System.in);

        int numero01;
        int numero02;
        int numero03;

        System.out.println("Digita um numero inteiro: ");
        numero01 = input.nextInt();

        System.out.println("Agora digita outro numero inteiro: ");
        numero02 = input.nextInt();

        System.out.println("Agora digita o ultimo numero: ");
        numero03 = input.nextInt();

        int soma = numero01 + numero02 + numero03;
        double media = (numero01 + numero02 + numero03) / 3;

        System.out.println("A soma dos numeros informados são: " + numero01 + " + " + numero02 + " + " + numero03 + " = " + soma);
        System.out.println("Sua média aritmética é " + media);
    }
}