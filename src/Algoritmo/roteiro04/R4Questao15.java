package Algoritmo.roteiro04;

import java.util.Scanner;

public class R4Questao15 {
    public static void main(String[] args) {
        float[] notas = new float[5];

        coletaNotas(notas);
        exibirNotas(notas, mediaNotas(notas));

        System.out.printf("Foram %d notas abaixo%n", notasAbaixo(notas));
        exibirAbaixo(notas);

        System.out.printf("Foram %d notas abaixo%n", notasAcima(notas));
        exibirAcima(notas);
    }




    public static void coletaNotas(float[] notas){
        //Esse metodo vai coletar as notas e inserir dentro do vetor
        Scanner input = new Scanner(System.in);

        for(int i=0; i < notas.length; i++){
            System.out.print("Digite uma nota: ");
            notas[i] = input.nextInt();
        }
    }

    public static float mediaNotas(float[] notas){
        //Esse metodo vai fazer a media das notas
        float media = 0.0f;
        for(Float var: notas){
            media += var;
        }
        media /= notas.length;
        return media;
    }

    public static void exibirNotas(float[] notas, float media){
        System.out.println("Essa foi a media: " + media);
        for(float var: notas){
            System.out.print(var + " ");
        }
        System.out.println();
    }

    public static int notasAbaixo(float[] notas){
        //Esse metodo vai retornar o numero de notas abaixo da media
        int notasAbaixo = 0;
        for(float var: notas){
            if(var < mediaNotas(notas)){
                notasAbaixo++;
            }
        }
        return notasAbaixo;
    }

    public static void exibirAbaixo(float[] notas){
        //Esse metodo vai retornar o numero de notas abaixo da media
        System.out.print("Notas abaixo: ");
        for(float var: notas){
            if(var < mediaNotas(notas)) System.out.print(var + " ");
        }
        System.out.println();
    }



    public static int notasAcima(float[] notas){
        //Esse metodo vai retornar o numero de notas acima da media
        int notasMaior = 0;
        for(float var: notas){
            if(var >= mediaNotas(notas)){
                notasMaior++;
            }
        }
        return notasMaior;
    }

    public static void exibirAcima(float[] notas){
        //Esse metodo vai retornar o numero de notas acima da media
        System.out.print("Notas acima: ");
        for(float var: notas){
            if(var >= mediaNotas(notas)) System.out.print(var + " ");
        }
        System.out.println();
    }
}
