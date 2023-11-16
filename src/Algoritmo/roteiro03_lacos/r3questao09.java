package Algoritmo.roteiro03_lacos;

public class r3questao09 {
    public static void main(String[] args){
        float h = 0;
        for(int i=1, j=1; i <= 50; i++, j+=2){
            h +=(float) j/i;
        }
        System.out.printf("O valor de H é: %.2f",h);
    }
}
