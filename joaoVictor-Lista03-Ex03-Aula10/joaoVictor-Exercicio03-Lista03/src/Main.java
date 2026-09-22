public class Main {
    static void main(String[] args) {
        /*Exercício 3 - Números pares de 1 a 20
        Desenvolva um algoritmo que exiba apenas os números pares no intervalo de 1 a 20.
        Foco: Compreender como avançar de dois em dois (i += 2) ou
         combinar o laço com uma condicional simples (if (i % 2 == 0)).
        */

        for (int i = 2; i <= 20; i+=2){
            System.out.println("Numeros pares são: "+ i);
        }
    }
}