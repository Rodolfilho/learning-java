package Algoritmo.roteiro03;

import java.util.Scanner;
public class r3questao10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual tabuada voce quer saber de 1 a 10: ");
        byte tabuada = teclado.nextByte();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d + %d = %d  " + "|  %d x %d = %d\n",tabuada, i, (tabuada + i), tabuada, i, (tabuada * i));
        }
    }
}
