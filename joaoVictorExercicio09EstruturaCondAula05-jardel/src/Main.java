/*Escreva um algoritmo que leia um número que represente a idade de
uma pessoa e informe se ela é maior ou menor de idade. O algoritmo deve
aceitar somente idades válidas.*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int idade;
        System.out.println("Digite a sua idade: ");
        idade = input.nextInt();

        if( idade >18){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você é menor de idade");
        }
    }
}