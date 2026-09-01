import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Exercício 5
        //Peça ao usuário sua altura (em metros) e seu peso (em kg). Calcule o IMC (peso / altura²) e mostre o valor calculado.

        Scanner input = new Scanner(System.in);

        double altura;
        double peso;

        System.out.println("Qual sua altura? (Em metros)  ");
        altura = input.nextDouble();

        System.out.println("Qual seu peso? (Em KG) ");
        peso = input.nextDouble();

        double imc = (peso / (altura * altura));

        System.out.println("Sua altura é " + altura + " Metros.");
        System.out.println("Seu peso é " + peso + "kg.");
        System.out.printf("O resultado do seu IMC é: %.2f%n", imc);
    }
}