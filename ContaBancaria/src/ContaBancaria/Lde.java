/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaBancaria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author a120104
 */
public class Lde {
    public CcLde primeiro;
    public CcLde ultimo;
    
    public Lde(){
        this.primeiro = null;
        this.ultimo = null;
    }
    
    public void inserir(CcLde item){
        if(listaVazia()){
            this.primeiro = item;
            
        }
        else{
            CcLde aux;
            aux = primeiro;
            while(true){
                if(aux.getProximo()== null){
                    aux.setProximo(item);
                    break;
                }
                aux = aux.getProximo();
            }
        }
        
    }
    
    /*public CcLde remover(int endereço){
        CcLde aux = this.primeiro;
        CcLde aux2 = this.primeiro;
        CcLde retorno = new CcLde();
        for(int i = 0; i < endereço;i++){
            aux = aux.getProximo();
        }
        for(int i = 0; i < endereço-1;i++){
            aux2 = aux.getProximo();
        }
        if(aux != null){
            retorno = aux;
        }
        while(true){
            if(aux.getProximo()== null){
                    break;
                }
            aux2.setProximo(aux);
            aux = aux.getProximo();
        }
        return retorno;
    }*/
    
     public CcLde remover(int endereço){
        CcLde aux = this.primeiro;
        CcLde aux2 = this.primeiro;
        CcLde retorno = new CcLde();
        for(int i = 0; i < endereço;i++){
            aux = aux.getProximo();
        }
        for(int i = 0; i < endereço-1;i++){
            aux2 = aux2.getProximo();
            
        }
        if(aux != null){
            retorno = aux;  
        }
       if(endereço == quant()-1){
                System.out.println("fudeu");
                System.out.println( aux2.toString());
                 aux2.setProximo(null);
                 
        }
       else if(endereço == 0){
           this.primeiro = aux.getProximo();
       }
       else{
                aux2.setProximo(aux.getProximo());
                System.out.println("deu");
       }
        return retorno;
    }
    
    @Override
    public String toString(){
        String retorno = new String();
        CcLde aux = this.primeiro;
        while(true){
            if(aux != null){
                retorno += "Numero da conta: " + aux.numero + "\n";
                retorno += "Saldo da conta: " + aux.saldo + "\n\n";
                aux = aux.getProximo();
            }
            else{
                break;
            }
        }
        return retorno;
    }
    
    public String toString(int j){
        String retorno = new String();
        CcLde aux = this.primeiro;
        aux = posição(aux, j);
        retorno += "Numero da conta: " + aux.numero + "\n";
        retorno += "Saldo da conta: " + aux.saldo + "\n";
        return retorno;
    }
    
    public boolean listaVazia(){
        if(this.primeiro == null){
            return true;
        }
        return false;
    }
    
    public int quant(){
        int i= 0;
        CcLde aux = this.primeiro;
        while(true){
            if(aux != null){
                aux = aux.getProximo();
                i++;
            }
            else{
                break;
            }
        }
        return i;
    }
    
    public CcLde posição(CcLde aux, int j){
        for(int i = 1; i  <= j; i++){
           aux = aux.getProximo();
        }
        return aux;
    }
    
    public void limpar(){
        this.primeiro = null;
    }
    
    public Lde concatenar(Lde lista2){
        Lde lista3 = new Lde();
        CcLde aux = this.primeiro;
        while(true){
            if(aux.getProximo() != null){
                lista3.inserir(aux);
                aux = aux.getProximo();
            }
            else{
                break;
            }
        }
        aux = lista2.primeiro;
        while(true){
            if(aux.getProximo() != null){
                lista3.inserir(aux);
                aux = aux.getProximo();
            }
            else{
                break;
            }
        }
        return lista3;
    }
    
     public Lde concatenar2(Lde lista2){
        Lde lista3 = new Lde();
        lista3.primeiro = this.primeiro;
        CcLde aux = lista3.primeiro;
        while(true){
            if(aux.getProximo() == null){
                aux.setProximo(lista2.primeiro);
                break;
            }
            aux = aux.getProximo();
        }
        return lista3;
    }
    
    public Lde igual(Lde lista2){
        Lde lista3 = new Lde();
        CcLde aux = this.primeiro;
        CcLde aux2 = lista2.primeiro;
        for(int j = 0; j < quant(); j++){
            for(int i = 0; i < lista2.quant();i++){
                    if(aux.numero == aux2.numero){
                        aux.saldo += aux2.saldo;
                        lista3.inserir(aux);
                    }
                    aux2 = aux2.getProximo();
            }
            aux2 = lista2.primeiro;
            aux = aux.getProximo();
        }
        return lista3;
    }
    
    public Lde diferente( Lde lista2 ){
        Lde lista3 = new Lde();
        CcLde aux = this.primeiro;
        CcLde aux2 = lista2.primeiro;
        int k = 0;
        for(int j = 0; j < quant(); j++){
            for(int i = 0; i < lista2.quant();i++){
                    if(aux.numero != aux2.numero){
                       k++;
                    }
                    aux2 = aux2.getProximo();
            }
            if(k == lista2.quant()){
                lista3.inserir(aux);
            }
            k = 0;
            aux2 = lista2.primeiro;
            aux = aux.getProximo();
        }
        aux = this.primeiro;
        aux2 = lista2.primeiro;
        k= 0;
        for(int j = 0; j < lista2.quant(); j++){
            for(int i = 0; i < quant();i++){
                    if(aux2.numero != aux.numero){
                       k++;
                    }
                    aux = aux.getProximo();
            }
            if(k == quant()){
                lista3.inserir(aux2);
            }
            k = 0;
            aux = this.primeiro;
            aux2 = aux2.getProximo();
        }
        return lista3;
    }
    
    public void bubbleSort(){
        CcLde aux = new CcLde();
        CcLde aux2 = new CcLde();
        CcLde aux3 = new CcLde();
        aux = this.primeiro;
        aux2 = this.primeiro.getProximo();
        for(int i = 0; i <  quant();i++){
            for(int j = 0; j < quant()-1; j++){
                if(aux.numero > aux2.numero){
                    if(aux == this.primeiro){
                        aux3 = aux.getProximo();
                        aux.setProximo(aux3.getProximo());
                        this.primeiro = aux3;
                        this.primeiro.setProximo(aux);

                    }
                    else{
                        aux3 = aux.getProximo();
                        aux.setProximo(aux3.getProximo());
                        aux2.setProximo(aux);
                    }
                    
                }
                aux = aux.getProximo();
                aux2= aux2.getProximo();
            }
            aux = this.primeiro;
            aux2 = this.primeiro.getProximo();
        }
    }
    
    
    public void gerar(){
        String nome = "C:\\Users\\VINICIUS\\Documents\\FACU\\2ano\\estrutura de dados\\Downloads (1)\\ContaBancaria\\src\\Lista de contas.txt";
        String nome2 = "C:\\Users\\VINICIUS\\Documents\\FACU\\2ano\\estrutura de dados\\Downloads (1)\\ContaBancaria\\src\\Lista de saldo.txt";
        int numero;
        double saldo;
        CcLde c;
        
        try{
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            
            FileReader arq2 = new FileReader(nome2);
            BufferedReader lerArq2 = new BufferedReader(arq2);
            String linha2 = lerArq2.readLine();
            
            while(linha != null){           
                numero = Integer.parseInt(linha.trim());
                saldo = Double.parseDouble(linha2.trim());
                c = new CcLde(numero, saldo);
                inserir(c);
               
                linha = lerArq.readLine();
                linha2 = lerArq2.readLine();
            }
        }
        catch(IOException e){
            System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
        }
         System.out.println();
    }
    
}
