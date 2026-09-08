import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        /*Exercício 1
        Faça um algoritmos que leia a idade de um nadador e classifique-o em uma categoria:
        Infantil (até 12 anos)
        Juvenil (13 a 17 anos)
        Adulto (18 anos ou mais)
        */

        Scanner input = new Scanner(System.in);

        String nomeDoNadador;
        int idade;

        System.out.println("Qual nome do nadador? ");
        nomeDoNadador = input.nextLine();

        System.out.println("Qual a idade desse nadador para saber sua categoria? ");
        idade = input.nextInt();

        if(idade >= 18){
            System.out.println("Sua classificação é adulto! Voce possui "+ idade + " Anos!");
        }else if (idade > 12){
            System.out.println("Sua classificação é juvenil! Voce possui "+ idade + " Anos!");
        }else {
            System.out.println("Sua classificação é infantil! Voce possui "+ idade + " Anos!");
        }
    }
}