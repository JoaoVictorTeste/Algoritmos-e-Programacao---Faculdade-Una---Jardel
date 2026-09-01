import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /* 03 Leia a nota de um aluno (0 a 10) e diga se ele foi aprovado (nota >= 7),
        se está em recuperação (nota >= 4) ou reprovado. */

        Scanner input = new Scanner(System.in);

        double nota;

        System.out.println("Digita a sua nota: ");
        nota = input.nextDouble();

        if(nota >= 7){
            System.out.println("Voce foi aprovado!");
        }else if (nota >= 4){
            System.out.println("Voce esta de recuperação!");
        }else{
            System.out.println("Voce esta reprovado!");
        }
    }
}