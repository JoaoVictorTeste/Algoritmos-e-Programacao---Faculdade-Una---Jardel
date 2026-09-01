import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero: ");
        numero = input.nextInt();


        if(numero > 0){
            System.out.println("Numero positivo");
        }else if (numero < 0){
            System.out.println("Numero negativo.");
        }else{
            System.out.println("O numero é zero.");
        }

    }
}