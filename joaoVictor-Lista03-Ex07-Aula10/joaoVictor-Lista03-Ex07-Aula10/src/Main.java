import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Exercício 7 - Acumulador e cálculo de média
        Enunciado: crie um programa que permita ao usuário inserir sucessivas notas de alunos (valores reais positivos).
         A leitura deve continuar repetidamente até que o usuário digite um valor negativo (um “flag” de encerramento, como -1).
         Ao final, o programa deve apresentar:
        A quantidade de notas válidas digitadas.
        A média aritmética simples dessas notas (com duas casas decimais).
        Atenção: o sistema deve verificar se ao menos uma nota válida foi digitada antes de calcular a média, evitando divisão por zero.
        Conceito-chave: laço (while ou do-while), soma cumulativa (soma += nota) e prevenção de erros lógicos.
        */

        Scanner input = new Scanner(System.in);

       double nota;
       double somaTotal = 0;
       int qtdDeNotasValidas = 0;

        do {
            System.out.println("Digite a nota do aluno (negativo para encerrar): ");
            nota = input.nextDouble();

            if (nota > 0) {
                somaTotal += nota;
                qtdDeNotasValidas++;
            }
        }while(nota >= 0);

        if (qtdDeNotasValidas > 0){
            double media = somaTotal / qtdDeNotasValidas;
            System.out.println("Quantidade de notas validas: " + qtdDeNotasValidas);
            System.out.printf("Média: %.2f%n", media);
        }else {
            System.out.println("Nenhuma nota validada foi digitada..");
        }
    }
}