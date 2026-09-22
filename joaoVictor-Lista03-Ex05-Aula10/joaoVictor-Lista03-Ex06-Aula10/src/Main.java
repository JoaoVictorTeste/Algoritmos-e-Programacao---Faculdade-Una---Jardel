import java.util.Scanner;

public class Main {
    static void main(String[] args) {
          /*Exercício 5 - Gerador de tabuada
            Enunciado: desenvolva um programa que solicite ao usuário um número inteiro qualquer.
            Utilizando um laço de repetição determinado, calcule e exiba a tabuada desse número de 1 a 10 no formato:
            numero x i = resultado
            Conceito-chave: estrutura de repetição contada (for), controle de variável contadora e formatação de saída.
            */


        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro qualquer: ");
        int numeroInt = input.nextInt();

        for (int i = 1; i <= 10; i++){
            int resultado = numeroInt * i;
            System.out.println(numeroInt + "x" + i + "=" + resultado);
        }

}
}
