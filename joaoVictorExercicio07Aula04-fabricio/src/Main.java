import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Crie um programa em java que leia o valor da gasolina e do etanol e informe a proporção que existe entre eles.

        Scanner input = new Scanner(System.in);

        double gasolina;
        double etanol;

        System.out.println("informe o valor da gasolina da sua região: ");
        gasolina = input.nextDouble();

        System.out.println("Informe o valor do etanol da sua região: ");
        etanol = input.nextDouble();

        double proporcao =  etanol / gasolina;

        System.out.println("A proporção ficou R$" + proporcao);
        
        if (proporcao <= 0.7) {
            System.out.println("Vale mais a pena abastecer com Etanol!");
        } else {
            System.out.println("Vale mais a pena abastecer com Gasolina!");
        }

    }
}