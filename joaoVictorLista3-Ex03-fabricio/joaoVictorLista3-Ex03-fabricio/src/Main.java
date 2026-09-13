import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 3. A dosagem de medicamento ministrada a um paciente deve ser calculada em função de sua
        massa (Kg) e de sua idade (anos).
        Codifique um programa que informe a dosagem de um medicamento para um determinado
        paciente e imprima a receita informando quantas gotas do medicamento o paciente deve
        tomar.
        O medicamento em questão possui 500 mg por ml; cada ml possui 20 gotas.
        Para prescrição da receita considere que:
        • adultos ou adolescentes desde os 12 anos, inclusive, devem tomar 1000 mg se tiverem
        a massa igual ou acima de 60 Kg. Com massa abaixo de 60 Kg, devem tomar 875 mg.
        • para crianças e adolescentes abaixo de 12 anos, a dosagem é calculada pela massa corpórea conforme a tabela a seguir:
        1
        Figura 1: Tabela de indicação
         */

        Scanner input = new Scanner(System.in);


        System.out.println("Qual nome do paciente?");
        String name = input.nextLine();

        System.out.println("Qual a sua idade " + name + "?");
        int idade = input.nextInt();

        System.out.println("Qual seu peso " + name + "?");
        double massa = input.nextDouble();

        double mgPorMl = 500;
        int gotasPorMl = 20;
        int dosagem;

        if (idade >= 12) {
            if (massa >= 60) {
                dosagem = 1000;
            } else {
                dosagem = 875;
            }
        } else {
            if (massa >= 5 && massa <= 9) {
                dosagem = 125;
            } else if (massa >= 9.1 && massa <= 16) {
                dosagem = 250;
            } else if (massa >= 16.1 && massa <= 24) {
                dosagem = 375;
            } else if (massa >= 24.1 && massa <= 30) {
                dosagem = 500;
            } else {
                dosagem = 750;
            }
        }

        double ml = dosagem / mgPorMl;

        double gotas = ml * gotasPorMl;

        System.out.println("Paciente: " + name);
        System.out.println("Dosagem: " + dosagem + "mg");
        System.out.println("Gotas: " + gotas);
    }
}