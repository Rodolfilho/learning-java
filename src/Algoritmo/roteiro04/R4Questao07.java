package Algoritmo.roteiro04;

import java.util.Scanner;

public class R4Questao07 {
    public static void main(String[] args){
        String[] aluno = new String[6];
        chamaMetodos(aluno);

    }

    public static void coletaDados(String[] aluno){
        //Essa metodo vai coletar os daods do aluno
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        aluno[0] = input.nextLine();


        for(int i=1; i < 4; i++) {
            System.out.printf("nota %d : ",i);
            aluno[i] = input.nextLine();
        }
    }

    public static void mediaAluno(String[] aluno) {
        //Esse metodo vai fazer a media do aluno e inserir no vetor
        float media = 0.f;
        for (int i = 1; i < 4; i++) {
            media += Float.parseFloat(aluno[i]);
        }
        media /= 3;
        aluno[4] = Float.toString(media);
    }

    public static void conceitoAluno(String[] aluno){
        //Esse metodo vai inserir no vetor o conceito do aluno de acordo com a media
        float media = Float.parseFloat(aluno[4]);
        if(media >= 80){
            aluno[5] = "A";
        }
        else if(media >= 50 && media < 80){
            aluno[5] = "B";
        }
        else{
            aluno[5] = "C";
        }

    }

    public static void exibirDados(String[] aluno){

        System.out.printf("%s obteve o conceito %s%n", aluno[0], aluno[5]);
        System.out.print("As tres notas fornecidas como entrda foram: ");
        for(int i=1; i < 4; i++ ){
            System.out.print(aluno[i] + " ");
        }
        System.out.print("com media final: " + aluno[4]);
    }

    public static void chamaMetodos(String[] aluno){
        //Esse metodo e so teste, mas ele chama todos os outros metodos para o main
        coletaDados(aluno);
        mediaAluno(aluno);
        conceitoAluno(aluno);
        exibirDados(aluno);

    }
}

