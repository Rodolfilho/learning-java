package Algoritmo.roteiro04_array_metodos;

import java.util.Scanner;

class Estacao{
    public float[] temperaturas = new float[12];
    public String nome;

    public Estacao(){
        this.nome = "";
    }
}



public class R4Questao07 {
    public static void main(String[] args) {
        Estacao estacao = new Estacao();
        coletaNome(estacao);

        System.out.println(estacao.nome);

    }



    public static void coletaNome(Estacao estacao){
        Scanner input = new Scanner(System.in);

        System.out.print("Nome da estação: ");
        estacao.nome = input.nextLine();

    }

    public static void exibeNome(Estacao estacao){
        System.out.println("A estaçao "+ estacao.nome);
    }
}

