import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Exercício 4
        //Peça ao usuário o valor de um produto e mostre o preço com 10% de desconto.
        Scanner input = new Scanner(System.in);

        double valorProduto;

        System.out.println("Informe um valor de algum produto: (Exemplo: 50,00)");
        valorProduto = input.nextDouble();

        double desconto = valorProduto * 0.10;
        double valorFinal = valorProduto - desconto;

        System.out.println("O valor do produto informado foi: R$" + valorProduto);
        System.out.printf("O produto informado acima com desconto de 10%% é: R$ %.2f", valorFinal);
            
    }
}
