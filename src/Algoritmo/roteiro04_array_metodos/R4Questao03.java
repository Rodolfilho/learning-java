package Algoritmo.roteiro04_array_metodos;

import java.util.Scanner;
import java.util.ArrayList;

public class R4Questao03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> subLista = new ArrayList<Integer>();

        Integer nota = -1, somaNotas = 0, media;
        ;
        while(true){
            System.out.print("Digite uma nota: ");
            nota = input.nextInt();

            if(nota == 0) break;

            lista.add(nota);

        }

        somaNotas = R4Questao02.somaValores(lista);
        media = notasMedia(lista);
        subLista = acimaMedia(lista, media);

        System.out.println("A media dos valore foi: " + media);
        System.out.print("Lista dps valores acima da media: ");
        for(int var: subLista){
            System.out.print(var + " ");
        }

    }


    public static int notasMedia(ArrayList<Integer> notas){
        int mediaNotas = 0;
        for(int var: notas){
            mediaNotas += var;
        }
        mediaNotas /= notas.size();

        return mediaNotas;
    }

    public static ArrayList<Integer> acimaMedia(ArrayList<Integer> notas, int media){
        ArrayList<Integer> acima = new ArrayList<>();
        for(int var: notas){
            if(var >= media){
                acima.add(var);
            }
        }
        return acima;
    }
}

