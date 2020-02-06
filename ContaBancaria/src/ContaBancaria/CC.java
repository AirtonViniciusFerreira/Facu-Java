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
public class CC {
    public int numero;
    public double saldo;
     
    public CC(){
        this.numero = 0;
        this.saldo = 0;
    }
    
    public CC(int num, double sd){
        this.numero = num;
        this.saldo = sd;
    }
    
    public boolean depositar(double sd){
            this.saldo += sd;
            return true;
    }
    public boolean sacar(double sd){
        if (sd > 0 && sd <= this.saldo){
            this.saldo -= sd;
            return true;
        }
            return false;
    }
    
    public String mostrarn(){
        return Integer.toString(this.numero);
    } 
    public String mostrars(){
        return Double.toString(this.saldo);
    }
    
    @Override
    public String toString(){
        return "Numero da conta: " + Integer.toString(this.numero) + "\n" + "Saldo: " + Double.toString(this.saldo);
    }
    
}
