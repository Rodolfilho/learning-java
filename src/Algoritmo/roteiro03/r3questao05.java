package Algoritmo.roteiro03;

import java.util.Scanner;
public class r3questao05 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numPessoas=0, media = 0, menor=0;
        while(true){
            System.out.print("Digite uma idade: ");
            int idade = teclado.nextInt();

            if(idade == -1) {
                break;
            }

            numPessoas++;
            media += idade;

            if(numPessoas == 1)
                menor = idade;
            else{
                if(idade < menor)
                    menor = idade;
            }
        }

        if(numPessoas >= 1)
            media /= numPessoas;
        else
            media /= 1;

        System.out.printf(  "A quantidade de idades foi: %d\n" +
                            "A idade media foi de: %d\n" +
                            "A menor idade foi: %d", numPessoas, media, menor);

    }
}
