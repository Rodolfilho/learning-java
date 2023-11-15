package Estudos;

//import java.util.Scanner;

import java.security.SecureRandom;//classe de numeros aleatorioa


public class Primeiro{
    public static final int LINHAS = 5;
    public static final int COLUNAS = 5;
    public static void main(String[] args){

        int[][][][] matriz = new int[LINHAS][COLUNAS][COLUNAS][LINHAS];

        for(int l=0; l < COLUNAS; l++){
            for(int c=0; c < COLUNAS; c++){
                for(int g=0; g < COLUNAS; g++) {
                    for(int i=0; i < LINHAS; i++) {
                        matriz[l][c][g][i] = new SecureRandom().nextInt(10) ;//metodo que gera os valores alatorios
                    }
                }
            }
        }


        for(int[][][] l: matriz) {
            for (int[][] c : l) {
                for (int g[] : c) {
                    for (int i : g) {
                        System.out.print(g + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}


