import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int dia;
        int meses;
        int anos;

        System.out.println("Digita o dia: ");
        dia = input.nextInt();

        System.out.println("Digita agora o mes: ");
        meses = input.nextInt();

        System.out.println("Digita o ano: ");
        anos = input.nextInt();

        System.out.println(" A data informada foi " + dia + "/" + meses + "/" + anos);


    }
}