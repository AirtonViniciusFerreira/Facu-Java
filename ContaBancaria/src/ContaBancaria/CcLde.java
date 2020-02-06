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
public class CcLde extends CC{
    private CcLde proximo;
    private CcLde anterior;
    
    public CcLde (){
        super();
        this.proximo = null;
    }
    
    public CcLde(int num, double sd){
        super(num, sd);
        this.proximo = null;
        
    }
    
    public CcLde getProximo(){
        return this.proximo;
    }
    
    public void setProximo(CcLde proximo){
        this.proximo = proximo;
    }
    public void setProximo(){
        this.proximo = null;
    }

    /**
     * @return the anterior
     */
    public CcLde getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(CcLde anterior) {
        this.anterior = anterior;
    }
    
}
