import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /* Exercício 6
          Crie um programa que leia o salário atual de um funcionário e a porcentagem de aumento que ele receberá.
             O sistema deve calcular e exibir:
             O valor em reais do aumento concedido.
             O novo salário final após o reajuste. */

        Scanner input = new Scanner(System.in); 

        String nomeFuncionario;
        double salario;

        System.out.println("Qual nome do funcionario? ");
        nomeFuncionario = input.nextLine();

        System.out.println(nomeFuncionario + ", qual valor do seu salario atual? ");
        salario = input.nextDouble();

        double aumento = salario * 0.070; // 7% de aumento.
        double salarioReajustado = salario + aumento;

        System.out.println("Seu salario é R$" + salario);
        System.out.printf("Seu aumento é R$ %.2f%n", aumento);
        System.out.println("Seu salário reajustado ficou: R$"+ salarioReajustado);
    }
}