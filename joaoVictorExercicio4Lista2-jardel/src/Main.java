import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /* Exercício 4
        Faça um algoritmo que leia três números inteiros e mostre qual deles é o maior.
        */

        Scanner input = new Scanner(System.in);

        int numb01;
        int numb02;
        int numb03;

        System.out.println("Informe o primeiro numero para saber qual é maior.! ");

        System.out.println("Informe o primeiro numero: ");
        numb01 = input.nextInt();

        System.out.println("Informe o segundo numero: ");
        numb02 = input.nextInt();

        System.out.println("Informe o terceiro numero: ");
        numb03 = input.nextInt();

        if(numb01 > numb02 && numb01 > numb03){
            System.out.println("Esse é o maior numero entre eles é o "+numb01);
        } else if (numb02 > numb01 && numb02 > numb03) {
            System.out.println("Esse é o maior numero entre eles é o "+ numb02);
        }else {
            System.out.println("Esse é o maior numero entre eles é o " + numb03);
        }
    }
}