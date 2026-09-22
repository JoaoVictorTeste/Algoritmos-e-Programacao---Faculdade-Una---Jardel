import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Exercício 8 - Estatísticas de coleta e maior/menor valor
            Enunciado: uma ONG precisa processar dados sobre doações comunitárias.
             Faça um programa que leia a quantidade total de doações recebidas no dia.
             Em seguida, leia os valores doados em reais (por exemplo: se antes foi informado que foram 5 doações,
              então devem ser lidos os valores dessas 5 doações) . O algoritmo deve determinar e exibir:
            O valor total arrecadado.
            O maior valor individual doado.
            O menor valor individual doado.
            Conceito-chave: inicialização de variáveis de extremo (maior e menor),
            estruturas de decisão aninhadas dentro do laço e lógica de atualização de máximos e mínimos.
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Quantas doações foram recebidas hoje? ");
        int qtdDoacoes = input.nextInt();

        double soma = 0;
        double maior = 0;
        double menor = 0;

        for (int i = 0; i < qtdDoacoes; i++) {
            System.out.println("Digite o valor da doação " + (i + 1) + ": ");
            double valor = input.nextDouble();

            soma += valor;

            if (i == 0) {
                maior = valor;
                menor = valor;
            } else {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }
        }

        System.out.println("Valor total arrecadado: " + soma);
        System.out.println("Maior doação: " + maior);
        System.out.println("Menor doação: " + menor);
    }
}