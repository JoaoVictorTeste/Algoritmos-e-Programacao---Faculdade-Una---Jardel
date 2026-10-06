import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* 05 - Um fiscal de qualidade mediu o peso (em kg) de 6 caixas em uma linha de produção.
        Logo após digitar os 6 pesos, o sistema deve pedir para o fiscal digitar um peso de referência para pesquisa.
        O programa deve analisar a lista informada e exibir:
         Quantas vezes aquele peso específico foi encontrado.
         Se o peso não foi encontrado em nenhuma das caixas, exibir: "Valor não localizado na amostragem".
         */

        Scanner input = new Scanner(System.in);

        double [] caixas = new double[6];

        double peso = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Digita o peso "+ (i + 1) + "ª caixa em kg:");
            caixas[i] = input.nextDouble();
        }
        System.out.println("Informe um peso de referência para pesquisa: ");
       double pesoDeReferencia = input.nextDouble();

       int quantidade = 0;

       for (int i = 0; i < 6; i++) {
           if (caixas[i] == pesoDeReferencia) {
               quantidade++;
           }
       }

        if (quantidade == 0) {
            System.out.println("Valor não localizado na amostragem");
        } else {
            System.out.println("O peso foi encontrado " + quantidade + " vez(es).");
        }

    }
}