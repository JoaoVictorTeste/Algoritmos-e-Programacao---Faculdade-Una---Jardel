import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Ex 02
         A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando dados sobre o salário e número de filhos.
         A prefeitura deseja saber: a) média do salário da população; b) média do número de filhos; c) maior salário;
         d) percentual de pessoas com salário de até 1 salário mínimo. Faça o algoritmo que entregue essas informações.
         O final da leitura de dados se dará com a decisão do usuário (ex.: "Continuar? S/N", ou "Digite 1 para continuar, 2 para sair".)
         */

        Scanner input = new Scanner(System.in);

        double somaSalarios = 0;
        int somaFilhos = 0;
        double maiorSalario = 0;
        int contador = 0;
        int contadorAteMinimo = 0;
        double salarioMinimo = 1621.0;


        while (true) {

            System.out.println("Qual Seu salario: ");
            double salario = input.nextDouble();

            System.out.println("Quantos filhos voce tem? ");
            int filhos = input.nextInt();

            somaSalarios += salario;
            somaFilhos += filhos;
            contador++;


            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
            if (salario <= salarioMinimo){
                contadorAteMinimo++;
            }
            System.out.println("===MENU===");
            System.out.println("Deseja continuar?");
            System.out.println("Digite 1 para continuar");
            System.out.println("Digite 2 para sair.");
            int opcao = input.nextInt();

            if (opcao != 1) {
                System.out.println("Saindo...");
                break;
            }
        }

        double mediaSalario = somaSalarios / contador;
        double mediaFilhos = (double) somaFilhos / contador;
        double percentual = (contadorAteMinimo * 100.0) / contador;

        System.out.println("A media do salario é " + mediaSalario);
        System.out.println("A media de filhos é " + mediaFilhos);
        System.out.println("O maior salario é " + maiorSalario);
        System.out.println("Percentual com salario de ate 1 salario minimo: " + percentual + "%");
    }
}