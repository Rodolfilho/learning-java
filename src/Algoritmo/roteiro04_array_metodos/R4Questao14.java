package Algoritmo.roteiro04_array_metodos;

import java.util.ArrayList;
import java.util.Random;
public class R4Questao14 {
    public static void main(String[] args){

        ArrayList<Integer> lista = new ArrayList<>();

        valoresAleatorios(lista,10);
        System.out.println(maiorValor(lista));
        exibirValores(lista);
    }


    public static void valoresAleatorios(ArrayList<Integer> lista, int tam){
        //Esse metodo vai encher o array com valores aleatorios desordenados
        Random random = new Random();
        for(int i=0; i < tam; i++){
            lista.add((random.nextInt(100) + 1));
        }
    }

    public static int maiorValor(ArrayList<Integer> lista){
        //Esse metodo vai retornar o incide do maior valor na primeira ocorrencia
        // se tiver mais de uma
        int maior = -9999999, indice = -1;
        for(int i=0; i < (lista.size() -1); i++){
            if(lista.get(i) > maior) {
                maior = lista.get(i);
                indice = i;
            }
        }
        return indice;
    }

    public static void exibirValores(ArrayList<Integer> lista){
        //Esse metodo vai exibir os valores na tela
        for(int var: lista){
            System.out.print(var + " ");
        }
    }
}
