import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Exercício 1
        //Peça ao usuário para digitar um número real (que pode ter casas decimais) e calcule o seu dobro.
        // Mostre o resultado.

        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Digita um numero para saber o dobro dele: ");
        numero = input.nextInt();

        int dobro = numero * 2;

        System.out.println("O dobro de " + numero + " é " + dobro);
    }
}