package Algoritmo.roteiro01_IO;

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero para calcular potencia de 3: ");
        int numero = teclado.nextInt();

        numero *= numero*numero;

        System.out.printf("O cubo desse numero é: %d", numero);

    }
}
