package Algoritmo.roteiro04_array_metodos;

import java.util.Scanner;
public class R4Questao11 {
    public static final int SEMANA = 7;
    public static void main(String[] args) {
        float[] minaNorte = new float[SEMANA];
        float[] minaSul = new float[SEMANA];

        dadosMina(minaSul);
        dadosMina(minaNorte);

        System.out.println("Produção do media do norte " + producaoMedia(minaNorte));

        System.out.println("Produção media so sul: " + producaoMedia(minaSul));

        maiorProducao(producaoMedia(minaNorte), producaoMedia(minaSul));
    }




    public static void dadosMina(float[] mina){
        Scanner input = new Scanner(System.in);
        for(int i=0; i < SEMANA; i++){
            System.out.print("Digite a produção do dia " + (i+1) + ": ") ;
            mina[i] = input.nextFloat();
        }
    }


    public static float producaoMedia(float[] mina){
        float media=0.f;
        for(int i=0; i < SEMANA; i++){
            media += mina[i];
        }
    return media /= SEMANA;
    }


    public static void maiorProducao(float norte, float sul){
        String maior = norte >= sul ? "Norte" : "Sul";
        System.out.println("A mina com maior produção foi a " + maior);
    }

}
