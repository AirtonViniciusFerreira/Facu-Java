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
public class Leso extends Lista{
    
    public Leso(int qts) {
        super(qts);
    }
    
    @Override
     public boolean inserir(CC conta){
        if(listaCheia() == false){
            int local = varredura(conta);
		for(int j = tamF; j > local;  j--){
                    this.listaConta[j] = this.listaConta[j-1];
		}
		this.listaConta[local] = conta;
		tamF++;
                return true;
        }
        return false;
    } 
    
    public boolean inseri(CC conta){
        if(listaCheia() == false){
                listaConta[tamF] = conta;
                this.tamF++;
                return true;
        }       
        return false;
    }   
    
     public boolean inserirBinario(CC conta){
        if(listaCheia() == false){
            int local = buscaBinaria(conta);
		for(int j = tamF; j > local;  j--){
                    this.listaConta[j] = this.listaConta[j-1];
		}
		this.listaConta[local] = conta;
		tamF++;
                return true;
        }
        return false;
    } 
    
    private int varredura(CC conta){
        int local = 0;
        int contaNumero = conta.numero;
        while(local  < this.tamF && listaConta[local].numero < contaNumero) local++;
	return local;
    }
    
    public boolean organiza(){
        CC aux = new CC();
        for(int i = 0; i < tamF-1; i++){
            if(listaConta[i].numero > listaConta[i+1].numero){
                aux = listaConta[i];
                listaConta[i] = listaConta[i+1];
                listaConta[i+1] = aux;
            }
        }
        return true;
    }
    
    public Leso concatena(Leso leso2){
        int novoTam = tamF + leso2.tamF;
        Leso aux = new Leso(novoTam);
        CC ccaux = new CC();
        
        for(int i = 0; i < tamF - 1; i++){
            ccaux = listaConta[i];
            aux.inseri(ccaux);
        }
        
        for(int i = 0; i < leso2.tamF-1; i++){
            ccaux = leso2.listaConta[i];
            aux.inseri(ccaux);
        }
        aux.organiza();
        return aux;
    }
    
    public Leso contatenaOrdenada(Leso leso2){
        int novoTam = tamF + leso2.tamF;
        Leso aux = new Leso(novoTam);
        CC ccaux = new CC();
        
        for(int i = 0; i < tamF - 1; i++){
            ccaux = listaConta[i];
            aux.inserir(ccaux);
        }
        
        for(int i = 0; i < leso2.tamF - 1; i++){
            ccaux = leso2.listaConta[i];
            aux.inserir(ccaux);
        }
        
        return aux;
    }
    
    public Leso igual(Leso leso2){
        int novoTam = tamF + leso2.tamF;
        Leso aux = new Leso(novoTam);
        CC ccaux = new CC();
        
        for(int i = 0; i < tamF - 1; i++){
            for(int j = 0; j < leso2.tamF -1; j++){
                if(listaConta[i].numero <= leso2.listaConta[j].numero){
                    if(listaConta[i].numero == leso2.listaConta[j].numero){
                        ccaux = listaConta[i];
                        aux.inseri(ccaux);
                    }
                }
                else{
                    break;
                }
            }
        }
        
        aux.organiza();
        return aux;
    }
    
    public Leso igualOrganizada(Leso leso2){
        int novoTam = tamF + leso2.tamF;
        Leso aux = new Leso(novoTam);
        CC ccaux = new CC();
        
        for(int i = 0; i < tamF - 1; i++){
            for(int j = 0; j < leso2.tamF -1; j++){
                if(listaConta[i].numero <= leso2.listaConta[j].numero){
                    if(listaConta[i].numero == leso2.listaConta[j].numero){
                        ccaux = listaConta[i];
                        aux.inserir(ccaux);
                    }
                    
                }  
                else{
                    break;
               }
            }
        }
       
        return aux;
    }
    
    public Leso diferente(Leso leso2){
        int novoTam = tamF + leso2.tamF;
        Leso aux = new Leso(novoTam);
        CC ccaux = new CC();
        int o = 0;
        int j;
        
        for(int i = 0; i < tamF - 1; i++){
            for( j = 0; j < leso2.tamF -1; j++){
               if(listaConta[i].numero <= leso2.listaConta[j].numero){
                    if(listaConta[i].numero != leso2.listaConta[j].numero){
                        o++;
                    }
               }
               else{
                   break;
               }
            }
            
            if(o == j){
                ccaux = listaConta[i];
                aux.inserir(ccaux);
            }
        }
        o=0;
        
        for(int i = 0; i < leso2.tamF - 1; i++){
            for( j = 0; j < tamF -1; j++){
                if(leso2.listaConta[i].numero <= listaConta[j].numero){
                    if(leso2.listaConta[i].numero != listaConta[j].numero){
                        o++;
                    }
                }
                else{
                    break;
                }
            }
            
            if(o == j){
                ccaux = leso2.listaConta[i];
                aux.inserir(ccaux);
            }
        }
        
        aux.organiza();
        return aux;
    }
    
    public Leso diferenteOrganizada(Leso leso2){
        int novoTam = tamF + leso2.tamF;
        Leso aux = new Leso(novoTam);
        CC ccaux = new CC();
        int o = 0;
        int j;
        
        for(int i = 0; i < tamF - 1; i++){
            for(j = 0; j < leso2.tamF -1; j++){
                if(listaConta[i].numero <= leso2.listaConta[j].numero){
                    if(listaConta[i].numero != leso2.listaConta[j].numero){
                        o++;
                    }
                }
                else{
                    break;
                }
            }
            
            if(o == j){
                ccaux = listaConta[i];
                aux.inserir(ccaux);
            }
        }
        
        o=0;
        for(int i = 0; i < leso2.tamF - 1; i++){
            for(j = 0; j < tamF -1; j++){
                if(leso2.listaConta[i].numero <= listaConta[j].numero){
                    if(leso2.listaConta[i].numero != listaConta[j].numero){
                        o++;
                    }
                }
                else{
                    break;
                }
            }
            
            if(o == j){
                ccaux = leso2.listaConta[i];
                aux.inserir(ccaux);
            }
        }
       
        return aux;
    }
    
    public int buscaBinaria(CC conta){
        int inicio = 0;
        int meio = 0;
        int fim = this.tamF - 1;
        while(inicio <= fim){
            meio = (inicio + fim)/2;
            if(this.listaConta[meio].numero == conta.numero){
                return meio;
            }
            else{
               if(this.listaConta[meio].numero < conta.numero){
                    inicio = meio + 1;
                }
                else if(this.listaConta[meio].numero > conta.numero){
                    fim = meio - 1;
                } 
            }   
        }
        if(tamF > 0){
            if(this.listaConta[meio].numero < conta.numero){
                meio++;
            }
        }
        return meio;
    }
}
