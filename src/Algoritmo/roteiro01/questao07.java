package Algoritmo.roteiro01;

import java.util.Scanner;

public class questao07 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua matricula: ");
        String matricula = teclado.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite seu salario: ");
        float salario = teclado.nextFloat();

        double deducaoInss = (salario * 0.15f);
        double salarioLiquido = salario - deducaoInss;
        System.out.printf(  "Matricula: %s\n" +
                            "Nome completo: %s\n" +
                            "Salario Bruto: %.2f\n" +
                            "Dedução do INSS: %.2f\n" +
                            "Salario Liquido: %.2f",matricula, nome, salario, deducaoInss, salarioLiquido);

    }
}
