/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaBancaria;

/**
 *
 * @author a120104
 */
public class Fifo extends Lista{
    
    public Fifo(int qts) {
        super(qts);
    }
    
    @Override
    public boolean inserir(CC conta){
        if(listaCheia() == false){
                listaConta[tamF] = conta;
                this.tamF++;
                return true;
        }       
        return false;
    }
    
    public String remover(){
        if(!listaVazia()){
            CC retorno;
            retorno = listaConta[0];
            for(int i = 0; i < tamF - 1;i++ ){
                listaConta[i] = listaConta[i+1];
            }
            tamF--;
            return retorno.toString();
        }
        return "Nao foi possivel remover. " ;
    } 
    
}
