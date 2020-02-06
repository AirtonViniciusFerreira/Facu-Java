package pokemons;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import local.Cordenadas;

// @author a120104 
public class Pokemons {
    private String indece;
    private ArrayList<String> tipo;
    private String nome;
    private Cordenadas cordenada;
    private int quantTipo = 0;
    private Date dat;
    private long seed;
    private int raridade;
    
    public Pokemons(){
        this.nome = new String();
        this.tipo = new ArrayList<String>();
        this.cordenada = new Cordenadas();
        this.dat = new Date();
        this.raridade = 0;
    }
    
    public Pokemons(String nome, Cordenadas cordenada){
        this.nome = nome;
        this.cordenada = cordenada;
        this.dat = new Date();
    }
        
    public String getTipo(int i) {
        return this.tipo.get(i);
    }

    public ArrayList<String> getTipo() {
        return tipo;
    }

    public void setTipo(ArrayList<String> tipo) {
        this.tipo = tipo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getIndece(){
        return this.indece;
    }
    
    public void setIndice(String indice){
        this.indece = indice;
    }

    public Cordenadas getCordenada() {
        return cordenada;
    }
    
    public void setCordenada(Cordenadas cordenada) {
        this.cordenada = cordenada;
    }
    
    /*
    public int gerarP(){
        int ret;
        long lDateTime = new Date().getTime();
        this.setSeed(lDateTime);
        Random gerador = new Random();
        gerador.setSeed(this.getSeed());
        ret = gerador.nextInt(151) + 1;
        return ret;
    }
    */
    

    public int gerarPP(){
        int ret;
        int seg = this.getDat().getSeconds();
        int min = this.getDat().getMinutes();
        double aux;
        aux = seg;
        if(seg == min){
           if(seg <= 15){
               aux = (seg * (-1));
           }
           else if(seg == 16){
               aux = -15.5;
           }
        }    
        ret = (int)((aux *2) +31); 
        return ret;
    }
    
    public boolean voador(){
        String voa = "Voador";
        return this.tipo.contains(voa);

    }
    
    public void abrir(){
        String nome = "src/pokemons/pokemons.txt";
        try{
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            
            int numero = gerarPP();
            for(int i = 1; i < numero; i++){
                linha = lerArq.readLine();
            }
            String pokegera[] = linha.split(";");
            this.setQuantTipo(pokegera.length);
            this.indece = pokegera[0];
            this.nome = pokegera[1]; 
            for(int i = 2; i < this.getQuantTipo(); i++){
                this.tipo.add(pokegera[i]);
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    @Override
    public String toString(){
       String retorno = new String();
       int tip = this.getQuantTipo() - 2;
       retorno = "Indice do pokemon: " + this.indece + "\n";
       retorno += "Pokemon: " + this.nome + "\n";
       retorno += "Tipos: ";
       for(int i = 0; i < tip; i++){
            retorno += this.tipo.get(i);
            if(i < tip-1){
                retorno +=  ",";
            }
       }
       retorno += "\nX: " + this.cordenada.getX();
       retorno += "\nY: " + this.cordenada.getY();
       retorno += "\nZ: " + this.cordenada.getZ();
       return retorno;
    }

    public int getQuantTipo() {
        return quantTipo;
    }

    public void setQuantTipo(int quantTipo) {
        this.quantTipo = quantTipo;
    }

    
    public long getSeed() {
        return seed;
    }

    public void setSeed(long seed) {
        this.seed = seed;
    }

    /**
     * @return the dat
     */
    public Date getDat() {
        return dat;
    }

    /**
     * @param dat the dat to set
     */
    public void setDat(Date dat) {
        this.dat = dat;
    }

    /**
     * @return the raridade
     */
    public int getRaridade() {
        return raridade;
    }

    /**
     * @param raridade the raridade to set
     */
    public void setRaridade(int raridade) {
        this.raridade = raridade;
    }

   
}
