import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /* Exercício 7
        Verificação de elegibilidade para financiamento bancário
        Faça um programa que leia:
        o valor da renda mensal de uma pessoa,
        o valor da prestação mensal que ela deseja pagar no financiamento.
        Verifique se ela pode assumir essa prestação com segurança, segundo esta regra:
        O valor da prestação não pode ultrapassar 30% da sua renda mensal.
        Além disso, se a prestação for muito alta (mais de R$ 3.000,00), também exigir que a renda mensal seja pelo menos R$ 10.000,00.
        Mostrar mensagens adequadas, por exemplo:
        “Financiamento aprovado”
        “Financiamento negado por alta prestação”
        “Financiamento negado por baixa renda”
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Qual valor da sua renda mensal? ");
        double rendaMensal = input.nextDouble();

        System.out.println("Qual valor da prestação mensal voce deseja pagar no financiamento? ");
        double valorPrestacaoFinanciamento = input.nextDouble();

        if(valorPrestacaoFinanciamento > rendaMensal * 0.30){
            System.out.println("Negado por alta prestação!");
        } else if (valorPrestacaoFinanciamento > 3000 && rendaMensal < 10000) {
            System.out.println("Negado por baixa renda!");
        }else {
            System.out.println("Aprovado!");
        }
    }
}