import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Exercício 3
        //Peça ao usuário para digitar sua idade em anos e depois converta essa idade para meses (1 ano = 12 meses).
        // Mostre o resultado.

        Scanner input = new Scanner(System.in);

        String nome;
        int idade;


        System.out.println("Digita seu nome: ");
        nome = input.nextLine();
        
        System.out.println("Digite sua idade: ");
        idade = input.nextInt();

        int meses = idade * 12;

        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade normal é " + idade + " Anos");
        System.out.println("Em meses fica: " + meses );

    }
}