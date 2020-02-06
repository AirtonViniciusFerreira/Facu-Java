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
public class Ldeo extends Lde {
    
    public Ldeo(){
        super();
    }
    
    @Override
    public void inserir(CcLde item){
        CcLde aux = this.primeiro;
        CcLde aux2;
        if(listaVazia()){
            this.primeiro = item;
        }
        else{
            while(true){
                if(aux.numero < item.numero){
                    aux2 = aux.getProximo();
                    if (aux2 == null){
                        aux.setProximo(item);
                        break;
                    }
                    else if(aux2.numero > item.numero){
                        item.setProximo(aux2);
                        aux.setProximo(item);
                        break;
                    }
                    aux = aux.getProximo();
                }else{
                    if(aux.equals(this.primeiro)){
                        this.primeiro = item;
                        item.setProximo(aux);
                        break;
                    }else{
                        aux.setAnterior(item);
                        break;
                    }
                }
            }
        }
    }
}
