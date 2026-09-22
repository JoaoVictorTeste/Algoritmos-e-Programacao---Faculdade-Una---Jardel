import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        /*Exercício 6 - Validador de entrada
        Enunciado: construa um algoritmo que simule o cadastro de senhas numéricas.
        O sistema deve solicitar que o usuário digite uma senha inteira de 4 dígitos.
        Enquanto o valor digitado for diferente da senha pré-definida (por exemplo, 2026), exiba a mensagem "Senha Incorreta!
        Tente novamente" e solicite um novo valor.
         Quando acertar, exiba "Acesso Autorizado!" e o número total de tentativas realizadas.
        Conceito-chave: laço condicional com teste no início (while), condição de parada e acumulador/contador de tentativas.
        EXTRA: mude o tipo de dado da senha de int para String. Realize novos testes. Algo mudou? Se sim, como resolver?
         */

        /*  USANDO O INT
                Scanner input = new Scanner(System.in);

                int senha;
                int senhapermanente;
                int numerosDeTentativas = 0;

                System.out.println("-----CADASTRO DE SENHA!------");

                System.out.println("DIGITE UMA SENHA DE 4 DIGITOS: ");
                senhapermanente = input.nextInt();

                do {
                    System.out.println("DIGITE A MESMA SENHA DE 4 DIGITOS ANTERIOR:");
                    senha = input.nextInt();

                    numerosDeTentativas++;

                    if (senha == senhapermanente) {
                        System.out.println("Acesso aprovado!");
                        System.out.println("Número de tentativas: " + numerosDeTentativas);
                        return;
                    } else {
                        System.out.println("Senha Incorreta! Tente novamente");
                    }
                } while (senha != senhapermanente);
            }
        }
         */

        // USANDO O STRING
        Scanner input = new Scanner(System.in);

        String senha = "0";
        String senhapermanente = "2026";
        int numerosDeTentativas = 0;

        System.out.println("-----CADASTRO DE SENHA!------");

        while (!senha.equals(senhapermanente)) {

            System.out.println("Digite uma senha:");
            senha = input.nextLine();

            numerosDeTentativas++;

            if (!senha.equals(senhapermanente)) {
                System.out.println("Senha Incorreta! Tente novamente");
            } else {
                System.out.println("Acesso aprovado!");

            }
            System.out.println("Número de tentativas: " + numerosDeTentativas);
        }
    }
}
