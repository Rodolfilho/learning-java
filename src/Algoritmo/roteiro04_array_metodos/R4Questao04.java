package Algoritmo.roteiro04_array_metodos;

import java.util.ArrayList;
import java.util.Arrays;

public class R4Questao04 {
    public static void main(String[] args){
        ArrayList<String> clientes = new ArrayList<String> (Arrays.asList("caio", "wellington", "pedro", "bruno", "ana", "caio", "bruno", "david", "pedro"));

        //Testes das funçoes
        //Fonecendo os proprios nomes para teste
        String[] nomes = {"rodolfo", "pedro", "ana"};

        //Testando se nomes estao na lista
        for(int i=0; i < nomes.length; i++){
            int ocorre = existeNome(clientes, nomes[i]);
            System.out.println("Nome : " + nomes[i] + " aparece(m): " + ocorre);
        }

        System.out.println();

        for(int i=0; i < nomes.length; i++){
            int ocorre = primeiraOcorrencia(clientes, nomes[i]);
            System.out.println("Nome : " + nomes[i] + " primeira ocorencia: " + ocorre);
        }

        System.out.println();

        for(int i=0; i < nomes.length; i++){
            int ocorre = ultimaOcorrencia(clientes, nomes[i]);
            System.out.println("Nome : " + nomes[i] + " ultima ocorencia: " + ocorre);
        }

        System.out.println();

        for(int i=0; i < nomes.length; i++){
            System.out.println("reomcendo o nome " + nomes[i]);
            removeOcorrencia(clientes, nomes[i]);
            for(String var: clientes){
                System.out.print(var + " ");

            }
            System.out.println();
        }

    }



    static int existeNome(ArrayList<String> clientesT, String nome){//trocar o parametro dessa função para ArrayList
        //verifica quantas vezes o nome esta na lista;
        int numOcorencias = 0;
        for(int i=0; i < clientesT.size(); i++){
            if(nome.equals(clientesT.get(i))){
                numOcorencias++;
            }
        }
        return numOcorencias;
    }

    static int removeOcorrencia(ArrayList<String> clientesT,String nome){
        //remover todas as ocorrencias do nome na lista
        int numNomes = existeNome(clientesT, nome);
        if(numNomes > 0){
            for(int i=0; i < numNomes; i++){
                clientesT.remove(nome);
            }
        }
        return numNomes;
    }

    static int primeiraOcorrencia(ArrayList<String> clientesT, String nome){
        //retorna a posição da primeira ocorrenciia do nome
        for(int i=0; i < clientesT.size(); i++){
            if(nome.equals(clientesT.get(i))) {
                return i;
            }
        }
        return -1;
    }

    static int ultimaOcorrencia(ArrayList<String> clientesT, String nome){
        //rerotna a ultima ocorrencia do nome na lista
        int primeira = primeiraOcorrencia(clientesT, nome), ultima = primeira;
        if(primeira == -1)
            return -1;
        else{
            for(int i=primeira; i < clientesT.size(); i++){
                if(nome.equals(clientesT.get(i)))
                    ultima = i;
            }
            return ultima;
        }
    }
}
