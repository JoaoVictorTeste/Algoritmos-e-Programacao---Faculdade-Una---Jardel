/*Leia o valor de uma compra.
        Se for maior ou igual a 100 reais, aplique 10% de desconto. Caso contrário, não aplique desconto.
        Mostre o valor */

import java.util.Scanner;

        public class Main{
            public static void main(String[] args){
                Scanner input = new Scanner(System.in);

                double compra;

                System.out.println("Se a sua compra for maior que 100 reais, você ganha 10% de desconto");

                System.out.println("Digite o valor da sua compra");
                compra = input.nextDouble();

                double desconto = 0.10;
                double total = compra * desconto;
                double compraTotal = compra - total;

                if(compra >= 100){
                    System.out.println("Você tem desconto de 10%");
                    System.out.println("Sua compra ficou" + " " + "R$" + compraTotal);
                }else{
                    System.out.println("Você não tem o desconto, pois sua compra não passou de R$100,00. ");
                }
            }
        }
