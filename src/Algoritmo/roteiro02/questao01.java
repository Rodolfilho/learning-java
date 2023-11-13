package Algoritmo.roteiro02;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero de maças: ");
        int numMacas = teclado.nextInt();

         double total = (numMacas >= 12) ? (numMacas * 1.1f) : (numMacas * 1.5f);

        System.out.printf("O valor da compra foi de: %.2f\n", total);

    }
}
