package Algoritmo.roteiro04;

import java.util.ArrayList;
import java.util.Random;

public class R4Questao06 {
    public static final int ANO = 12;
    public static void main(String[] args){
        String[] meses = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        ArrayList<Integer> tempMedias = new ArrayList<>();

        preencheTemperatura(tempMedias);

        mediasMeses(tempMedias);
        mediaAno(tempMedias);
        mesesMaior(mesesMaiorMedia(tempMedias), meses);
        mesesMenor(mesesMenorMedia(tempMedias), meses);
        mesesIguais(mesesIgualMedia(tempMedias));
    }



    public static Integer mediaAnual(ArrayList<Integer> temperaturas){
        //Esse metodo retornar a media anual das temperaturas
        Integer media=0;
        for(int i=0; i < temperaturas.size(); i++){
            media += temperaturas.get(i);
        }

        return (media /= temperaturas.size());
    }

    public static int tempMaiorMedia(ArrayList<Integer> temperaturas){
        //Esse metodo vai retornar a quantidade de temperaturas acima da media
        int maior=0;
        for(int i=0; i < temperaturas.size(); i++){
            if(temperaturas.get(i) >= mediaAnual(temperaturas)) maior++;
        }
        return maior;
    }

    public static ArrayList<Integer> mesesMaiorMedia(ArrayList<Integer> temperaturas){
        //Esse metodo vai retornar um array com as posiçoes dos messe maiore que a media anual
        ArrayList<Integer> mesesMaior = new ArrayList<Integer>();
        for(int i=0; i < temperaturas.size(); i++){
            if(temperaturas.get(i) >= mediaAnual(temperaturas)) mesesMaior.add(i);
        }
        return mesesMaior;
    }

    public static ArrayList<Integer> mesesMenorMedia(ArrayList<Integer> temperaturas){
        //Esse metodo vai retornar um array com as posiçoes dos messes menores que a media anual
        ArrayList<Integer> mesesMenor = new ArrayList<Integer>();
        for(int i=0; i < temperaturas.size(); i++){
            if(temperaturas.get(i) < mediaAnual(temperaturas)) mesesMenor.add(i);
        }
        return mesesMenor;
    }

    public static Integer mesesIgualMedia(ArrayList<Integer> temperaturas){
        //Esse metodo vai retornar messes que são iguais a temperatura anual
        int igual = 0;
        for(int i=0; i < temperaturas.size(); i++){
            if(temperaturas.get(i) == mediaAnual(temperaturas)) igual++;
        }
        return igual;
    }

    //
    //Esses metodo abaixo sao para reduzir o codigo do metodo main
    //

    public static void preencheTemperatura(ArrayList<Integer> temperaturas){
        Random random = new Random();

        for(int i=0; i < ANO; i++){
            int num = random.nextInt(40) + 1;
            temperaturas.add(num);
        }
    }

    public static void mediasMeses(ArrayList<Integer> temperaturas){
        //Esse metodo vai imprimir na tela os valores mensais
        System.out.print("Temperaturas: ");
        for(Integer var: temperaturas){
            System.out.printf("%d ", var);
        }
        System.out.println();
    }

    public static void mediaAno(ArrayList<Integer> temperaturas){
        //Esse metodo vai imprimir na tela a media anual
        Integer ano = mediaAnual(temperaturas);
        System.out.printf("A media do ano foi: %d%n" ,ano);
    }

    public static void mesesMaior(ArrayList<Integer> maior, String[] meses){
        //Esse metodo vai imprimir qais messe tiverao a temperatura media acima da media ou igual
        System.out.print("Meses acima da media: ");
        for(int i=0; i < maior.size(); i++){
            System.out.print(meses[maior.get(i)] + " ");
        }
        System.out.println();
    }

    public static void mesesMenor(ArrayList<Integer> menor, String[] meses){
        //Esse metodo vai imprimir qais messe tiverao a temperatura media acima da media ou igual
        System.out.print("Meses abaixo da media: ");
        for(int i=0; i < menor.size(); i++){
            System.out.print(meses[menor.get(i)] + " ");
        }
        System.out.println();
    }

    public static void mesesIguais(Integer igual){
        if(igual > 0){
            System.out.printf("Foram %d meses iguais a media: ", igual);
        }
        else{
            System.out.println("Não teve meses iguail a media");
        }
    }

}
