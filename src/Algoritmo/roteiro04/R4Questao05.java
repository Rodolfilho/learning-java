package Algoritmo.roteiro04;

import java.util.ArrayList;
import java.util.Scanner;

class Struct{
    //usando a visibilidade publica para se assemelhar melhor com uma Struct do c/c++
    public String nome;
    public Integer idade;
    void Struct(){
        this.nome = "";
        this.idade = null;
    }
}

public class R4Questao05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Struct> clientes = new ArrayList<> ();


        while(true){
            Struct cliente = new Struct();
            System.out.print("Digite o nome do cliente: ");
            cliente.nome = input.nextLine();

            if(cliente.nome.equals("-1")){
                break;
            }

            System.out.print("Digite a idade do cliente: ");
            cliente.idade = input.nextInt();

            input.nextLine();

            if(cliente.idade == -1) {
                break;
            }

            clientes.add(cliente);
            //System.out.println(cliente.nome + " " + cliente.idade);

        }

        System.out.println(primeiroNome(clientes, "rodolfo"));




    }
    public static int exiteNome(ArrayList<Struct> clientes, String nome){
        //essa função vai retornar o numero de ocorrencias de um nome na lista
        int ocorencia = 0;
        for(int i=0; i < clientes.size(); i++){
            if(nome.equals(clientes.get(i).nome)) ocorencia++;
        }
        return ocorencia;
    }

    public static int existeIdade(ArrayList<Struct> cliente, int idadeT){
        //Essa função vai retornar a numero de ocorencias de uma idade fornecida
        int ocorrencia = 0;
        for(int i=0; i < cliente.size(); i++){
            if(idadeT == cliente.get(i).idade) ocorrencia++;
        }
        return ocorrencia;
    }

    public static void removeNome(ArrayList<Struct> cliente, String nome){
        //Essa função vai remover todas as ocorrencias do cliente pelo nome no Array

        for(int i=0; i < cliente.size(); i++){
            if(nome.equals(cliente.get(i).nome)) cliente.remove(i);
        }
    }

    public static void removeIdade(ArrayList<Struct> cliente, int idade){
        //essa função vai remover todos as ocorrencias de clientes com a mesma idade
        for(int i=0; i < cliente.size(); i++){
            if(idade == cliente.get(i).idade) cliente.remove(i);
        }


    }

    public static int primeiroNome(ArrayList<Struct> cliente, String nome){
        //Essa função vai retornar a primeira ocorrencia do nome na na lista, se não tiver -1
        for(int i=0; i < cliente.size(); i++){
            if(nome.equals(cliente.get(i).nome)) return i;
        }
        return -1;
    }

    public static int primeiraIdade(ArrayList<Struct> cliente, int idade){
        //Essa função vai retornar a primeira ocorrencia da idade na lista, se não tiver -1
        for(int i=0; i < cliente.size(); i++){
            if(idade == cliente.get(i).idade) return i;
        }
        return -1;
    }
    
    public static int ultimoNome(ArrayList<Struct> cliente, String nome){
        //Essa função vai retorna a ultima ocorrencia do nome na lista
        int primeiro = primeiroNome(cliente, nome);
        if(primeiro == -1) return primeiro;
        else{
            for(int i=primeiro; i < cliente.size(); i++){
                if(nome.equals(cliente.get(i).nome)) primeiro = i;
            }
            return primeiro;
        }
    }

    public static int ultimaIdade(ArrayList<Struct> cliente, int idade){
        //Essa função vai retorna a ultima ocorrencia do nome na lista
        int primeiro = primeiraIdade(cliente, idade);
        if(primeiro == -1) return primeiro;
        else{
            for(int i=primeiro; i < cliente.size(); i++){
                if(idade == cliente.get(i).idade) primeiro = i;
            }
            return primeiro;
        }
    }

}