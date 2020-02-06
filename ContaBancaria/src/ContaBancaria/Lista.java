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


public class Lista {
    public CC[] listaConta;
    public int maxtam;
    public int tamF;
    public int i;
    public int esq = this.tamF / 2;
    public int dir = this.tamF / 2;
    
    public Lista(int qts){
       this.maxtam = qts;
       this.listaConta = new CC[qts];
       this.tamF = 0;
    }
    
    public CC getlista(int num){
        for(i = 0; i < this.maxtam; i++ ){
            listaConta[i].numero = num;
            return listaConta[i];
        }
        return null;
    }
    
    public boolean inserir(CC conta){
        if(listaCheia() == false){
                listaConta[tamF] = conta;
                this.tamF++;
                return true;
        }       
        return false;
    }  
    
    public String remover(int pos){
        if(listaVazia() != false && pos < this.tamF){
            CC e;
            e = listaConta[pos];
            for(int j = pos; j < tamF; j++){
                listaConta[j] = listaConta[j+1];  
            }
            listaConta[tamF - 1] = null;
            tamF--;
            return e.toString();
        }
        else{
            return "Não foi possivel remover. \n";
        }
    }
    
    public String toString(){
        String imprimir = "";
        for(int j = 0; j < this.tamF; j++){
            imprimir += "Indice: " + j + "\n";
            imprimir += "Numero da conta: " + listaConta[j].mostrarn() + "\n";
            imprimir += "Saldo: " + listaConta[j].mostrars() + "\n";
        }
        return imprimir;
    }
    
    public String toString(int pos){
        String imprimir = "";
        if(!listaVazia() && pos < this.tamF){
            imprimir += "Indice: " + pos + "\n";
            imprimir += "Numero da conta: " + listaConta[pos].mostrarn() + "\n";
            imprimir += "Saldo: " + listaConta[pos].mostrars() + "\n";
        }
        return imprimir;
    }

    public boolean listaVazia(){
        if(this.tamF == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean listaCheia(){
        if(this.tamF == this.maxtam){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void limpar(){
        this.tamF = 0;
    }
    
    public Lista concatena(Lista lis){
        Lista concatenada;
        int taml = lis.maxtam;
        int tam = this.maxtam + taml;
        concatenada = new Lista(tam);
        for(int j = 0; j < this.tamF; j++){
            concatenada.inserir(this.listaConta[j]);
        } 
        for(int j = 0; j < lis.tamF; j++){
            concatenada.inserir(lis.listaConta[j]);
        }
        return concatenada;
    }
    
    public Lista iguais(Lista lis){
        Lista igual;
        int taml = lis.maxtam;
        int tam = this.maxtam + taml;
        igual = new Lista(taml);
        for(int j = 0; j < this.tamF; j++){
            for(int h = 0; h < lis.tamF;h++){
                if(this.listaConta[j].numero == lis.listaConta[h].numero){
                    this.listaConta[j].saldo += lis.listaConta[h].saldo;
                    igual.inserir(this.listaConta[j]);
                }
            }
        }
        return igual;
    }
    
    public Lista diferente(Lista lis){
        Lista diferente;
        int taml = lis.maxtam;
        int tam = this.maxtam + taml;
        int ret = 0;
        diferente = new Lista(taml);
        for(int j = 0; j < this.tamF; j++){
            for(int h = 0; h < lis.tamF;h++){
               if(this.listaConta[j].numero != lis.listaConta[h].numero){
                    ret++;
                }
            }
            if(ret == lis.tamF){
                diferente.inserir(this.listaConta[j]);
            }
            ret = 0;
            
        }
        ret = 0;
        for(int j = 0; j < lis.tamF; j++){
            for(int h = 0; h < this.tamF;h++){
               if(lis.listaConta[j].numero != this.listaConta[h].numero){
                    ret++;
                }
            }
            if(ret == this.tamF){
                diferente.inserir(lis.listaConta[j]);
            }
            ret = 0;
        }
        return diferente;
        
    }
    
     public void bubbleSort(){
        CC aux = new CC();
        
        for(int i = 0; i < this.tamF; i++){
            for(int j = 0; j < this.tamF -1; j++){
                if(this.listaConta[j].numero > this.listaConta[j+1].numero){
                    aux = this.listaConta[j];
                    this.listaConta[j] = this.listaConta[j+1];
                    this.listaConta[j+1] = aux;
                } 
            }
        }
    }
    
     public void insectionSort(){
         CC aux = new CC();
        
        for(int i = 0; i < this.tamF; i++){
            for(int j = 1; j < this.tamF; j++){
                if(this.listaConta[j].numero < this.listaConta[j-1].numero){
                    aux = this.listaConta[j];
                    this.listaConta[j] = this.listaConta[j-1];
                    this.listaConta[j-1] = aux;
                } 
            }
        }
     }
     
     public void quickSort (){
         
     }
     
     public void mergeSort (){
         
     }
     
     
    public void gerar(){
        String nome = "C:\\Users\\VINICIUS\\Documents\\FACU\\2ano\\estrutura de dados\\Downloads (1)\\ContaBancaria\\src\\Lista de contas.txt";
        String nome2 = "C:\\Users\\VINICIUS\\Documents\\FACU\\2ano\\estrutura de dados\\Downloads (1)\\ContaBancaria\\src\\Lista de saldo.txt";
        int numero;
        double saldo;
        CC c;
        
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
                c = new CC(numero, saldo);
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
