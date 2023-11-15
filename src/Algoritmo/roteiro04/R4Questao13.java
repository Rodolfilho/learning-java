package Algoritmo.roteiro04;

import java.util.ArrayList;
import java.util.Scanner;
public class R4Questao13 {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();

        valoresPares(valores, lendoValores(valores));


    }



    public static int lendoValores(ArrayList<Integer> pares){
        Scanner input = new Scanner(System.in);
        int numPar = 0;
        while(true){
            System.out.print("Digite um valor: ");
            int valor = input.nextInt();
            if(valor == 0)
                break;
            else if(valor%2 == 0){

                numPar++;
            }
            pares.add(valor);
        }
        return numPar;
    }

    public static void valoresPares(ArrayList<Integer> pares, int num){
        System.out.println("Foram " + num + " numeros pares");

        System.out.print("Valores da lista: ");
        for(int var: pares){
            System.out.print(var + " ");
        }
        System.out.println();
    }

}
