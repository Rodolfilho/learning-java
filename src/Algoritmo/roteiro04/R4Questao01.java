package Algoritmo.roteiro04;

import java.util.Scanner;
import java.util.ArrayList;

public class R4Questao01 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();

        Integer nota = -1, somaNotas = 0;
        ;
        while(true){
            System.out.print("Digite uma nota: ");
            nota = input.nextInt();

            if(nota == 0) break;

            lista.add(nota);
            somaNotas += nota;

        }

        System.out.print("Lista das notas: ");
        for(int var: lista)
            System.out.print(var + " ");
        System.out.println();
        System.out.print("Soma de todas as notas: " + somaNotas);

    }
}
