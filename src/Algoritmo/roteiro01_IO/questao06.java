package Algoritmo.roteiro01_IO;

import java.util.Scanner;

public class questao06 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite sua nota 1: ");
        float nota1 = teclado.nextInt();

        System.out.print("Digite sua nota 2: ");
        float nota2 = teclado.nextInt();

        System.out.print("Digite sua nota 3: ");
        float nota3 = teclado.nextInt();

        float media =(float) ((nota1 * 0.2f) + (nota2 * 0.3f) + (nota3 * 0.5f));

        System.out.printf( "Seu nome: %s\n" +
                            "Primeira nota: %.1f\n" +
                            "Segunda nota: %.1f\n" +
                            "Terceira nota: %.1f\n" +
                            "Media Ponderada: %.1f\n",nome, nota1,nota2,nota3,media);
    }
}
