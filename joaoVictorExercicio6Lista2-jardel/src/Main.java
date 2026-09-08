import java.util.Scanner;

public class Main {
    public static void main(String[] args){

            /*Exercício 7 (Ascencio e Campos, adaptado)
            Você está trabalhando no protótipo de um sistema emissor de notas fiscais, que, nesta etapa,
             receberá apenas o código e a quantidade de um produto comprado. O programa deve calcular e mostrar:
            o preço unitário do produto comprado, de acordo com a tabela I;o preço total da nota;
            o valor do desconto, seguindo a Tabela II e aplicado sobre o preço total da nota; e
            o preço final da nota, depois do desconto.
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Digita o código abaixo entre 1 a 40: ");
        int opcaoCod = input.nextInt();

        System.out.println("Digite a quantidade: ");
        int quantidade = input.nextInt();

        double precoUnitario;

        if (opcaoCod >= 1 && opcaoCod <= 10){
            precoUnitario = 10.0;
        } else if (opcaoCod >= 11 && opcaoCod <= 20){
            precoUnitario = 15.0;
        } else if (opcaoCod >= 21 && opcaoCod <= 30){
            precoUnitario = 20.0;
        } else if (opcaoCod >= 31 && opcaoCod <= 40){
            precoUnitario = 30.0;
        } else {
            System.out.println("CODIGO INVALIDO!!");
            return;
        }

        System.out.println("Preço unitário: R$" + precoUnitario);

        double precoTotal = precoUnitario * quantidade;
        System.out.println("Preço total da nota sem desconto: R$" + precoTotal);

        double valorDesconto;
        double precoFinalDaNota;

        if (precoTotal <= 250){
            valorDesconto = precoTotal * 0.05;
        } else if (precoTotal > 250 && precoTotal <= 500) {
            valorDesconto = precoTotal * 0.10;
        } else {
            valorDesconto = precoTotal * 0.15;
        }

        precoFinalDaNota = precoTotal - valorDesconto;

        System.out.println("Valor do desconto: R$" + valorDesconto);
        System.out.println("Preço final da nota: R$" + precoFinalDaNota);
    }
}