package Algoritmo.roteiro04_array_metodos;

import java.util.ArrayList;
import java.util.Scanner;
public class R4Questao16 {
    public static void main(String[] args){
        ArrayList<Integer> valores = new ArrayList<>();
        collectDado(valores);
        exibirValores(valores);

    }

    public static void collectDado(ArrayList<Integer> valores){
        //Essa função ela recebe os valores e coloca ordenados no array
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Digite um valor: ");
            int num;
            num = input.nextInt();

            if(num >= 1) {
                if(valores.isEmpty()) {
                    valores.add(num);
                    continue;
                }

                int maior = valores.get(valores.size()-1);
                if(num >= maior){
                    valores.add(num);
                }
                else{
                    int i= valores.size()-1;
                    while(num < valores.get(i)){
                        i--;
                    }
                    valores.add(i, num);
                }

            }
            else if (num == 0) break;

        }
    }

    public static void exibirValores(ArrayList<Integer> valores){
        for(int var: valores){
            System.out.print(var + " ");
        }
    }
}
