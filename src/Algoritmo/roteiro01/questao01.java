package Algoritmo.roteiro01;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("DIgite seu salario: ");
        float salario = teclado.nextFloat();

        salario += (salario * 0.2f);
        System.out.printf("Seu nome é %s e seu salario reajustado é %.2f", nome, salario);
    }
}
